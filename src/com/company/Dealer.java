package com.company;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Dealer {

    public ArrayList<Card> getPlayer() { return player; }
    public ArrayList<Card> getDealer() { return dealer; }

    private ArrayList<Card> player = new ArrayList<>();
    private ArrayList<Card> dealer = new ArrayList<>();

    private boolean gameOver = false;
    private boolean canSplit = false;
    private boolean canDoubleDown = false;
    public static boolean playerHasStopped = false;
    private boolean dealerHasStopped = false;
    private int gamesWithoutShuffel = 0;
    private int input;
    private boolean playerWon;
    private boolean itsATie;
    private boolean playerLost;



    private int totalPlayerValue;

    public int getTotalDealerValue() {
        return totalDealerValue;
    }

    private int totalDealerValue;

    public int getTotalPlayerValue() {
        return totalPlayerValue;
    }

    private Printer print = new Printer();

    // Card to player
    // Card to dealer you can see
    // Card to player
    // Card to dealer (blank card)

    public Deck deck = new Deck();



    public void generateDeck() {
        deck.createDeck(3);
    }


    public void startDeal() {


        playerHasStopped = false;
        player.clear();
        dealer.clear();
        canDoubleDown = true;
        playerWon = false;
        gameOver = false;
        itsATie = false;
        playerLost = false;

        totalDealerValue = 0;
        totalPlayerValue = 0;

        if (Main.currency < Main.betSize) {
            canDoubleDown = false;
        }



        player.add(deck.deck.get(0));
        deck.deck.remove(0);

        dealer.add(deck.deck.get(0));
        deck.deck.remove(0);

        player.add(deck.deck.get(0));
        deck.deck.remove(0);

        dealer.add(deck.deck.get(0));
        deck.deck.remove(0);







        updateCardValue();

        System.out.println(totalPlayerValue);
        if (totalPlayerValue == 21) {
            playerHasStopped = true;
            updateCardValue();
            if (totalDealerValue < 17) {
                dealerDraw();
            } else {
                updateUI();
            }
        } else {

            updateUI();

            gamePlay();
        }
    }





    public void gamePlay() {
        Scanner in = new Scanner(System.in);



        // (1) = hit / (2) = stand / (3) = double down / (4) split




            while (!gameOver) {


            while (true) {


                while (!in.hasNextInt()) {
                    System.err.println("Input must be a number showed on the screen!");

                    in.next();
                }

                input = in.nextInt();



                if (input == 1) {
                    break;
                }
                if (input == 2) {
                    break;
                }
                if (input == 3 && canDoubleDown) {
                    break;
                } else if (input == 3) {
                    System.err.println("You can't double down right now");
                }
                if (input == 4 && canSplit) {
                    break;
                } else if (input == 4) {
                    System.err.println("You don't have the cards needed to split");
                }
                System.err.println("That's not a valid number");
                }


            switch (input) {
                case 1:
                    player.add(deck.deck.get(0));
                    deck.deck.remove(0);

                    canDoubleDown = false;

                    checkPoints();

                    if (totalPlayerValue == 21 || player.size() == 5 ) {

                        break;

                    }

                        updateUI();




                    // Print updated player UI



                    break;
                case 2:
                    // Stand

                    playerHasStopped = true;

                    dealerDraw();


                break;


                case 3:
                    // Double down
                    player.add(deck.deck.get(0));
                    deck.deck.remove(0);

                    Main.currency -=  Main.betSize ;

                    Main.betSize *= 2;

                    playerHasStopped = true;

                    dealerDraw();

                    break;
            }


        }






    }


    private void checkPoints() {

            if (!gameOver) {

            updateCardValue();



            if  (totalPlayerValue > 21) {
                playerLost = true;
                gameOver = true;
            }
             else if (totalDealerValue > 21) {
                playerWon = true;
                gameOver = true;
            }
                else if (totalPlayerValue == totalDealerValue && playerHasStopped && totalDealerValue > 16 && player.size() != 5){
                itsATie = true;
                gameOver = true;
            }
            else if (totalPlayerValue > totalDealerValue && playerHasStopped && totalDealerValue > 16) {
                playerWon = true;
                 gameOver = true;
            }
            else if (totalPlayerValue == 21  && totalDealerValue < 17 && !playerHasStopped) {
                playerHasStopped = true;
                dealerDraw();
            }
            else   if (totalPlayerValue < totalDealerValue && totalDealerValue > 16 && player.size() != 5) {
                playerLost = true;
                 gameOver = true;
            }
            else  if (player.size() == 5 && totalDealerValue > 16 && totalDealerValue != 21) {
                playerWon = true;
                 gameOver = true;
            }
            else  if (player.size() == 5 && totalDealerValue == 21) {
                playerLost = true;
                gameOver = true;
            }
            else if (player.size() == 5 && !playerHasStopped ) {
                playerHasStopped = true;
                dealerDraw();
            }
        }

    }

    public void dealerDraw()   {

        checkPoints();

        updateUI();


        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // dealer values is under 16 and the value of the dealer is smaller than the player
        while (totalDealerValue < 17 && totalDealerValue < totalPlayerValue) {

            dealer.add(deck.deck.get(0));
            deck.deck.remove(0);

            checkPoints();

            updateUI();


            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        dealerHasStopped = true;

        if (!gameOver) {
            checkPoints();
            updateUI();

        }

    }


    private void updateCardValue() {
        totalDealerValue = 0;
        totalPlayerValue = 0;


        for (Card card : player) {
            totalPlayerValue += card.value;
        }
        for (Card card : player) {
            if (totalPlayerValue > 21) {
                if (card.isAce()) {
                    totalPlayerValue -= 10;
                }
            }
        }




        for (Card  card : dealer ){
            if (playerHasStopped) {
            totalDealerValue += card.value;
            }  else {
                totalDealerValue = dealer.get(0).value;
            }
        }
        if (playerHasStopped) {
            for (Card card : dealer) {
                if (totalDealerValue > 21) {
                    if (card.isAce()) {
                        totalDealerValue -= 10;
                    }
                }
            }
        }


    }

        private void updateUI() {

        Printer print = new Printer();

            for (Card card : player) {
                print.printCard(card , player);
            }
            if (!playerHasStopped) {
                print.printCard(dealer.get(0) , dealer );
                print.blankCard();
            } else {
                for (Card card : dealer) {
                    print.printCard(card, dealer);
                }
            }


            print.status(Main.betSize, Main.currency, canDoubleDown , playerWon , itsATie, playerLost);



            print.gamePlay( totalPlayerValue , totalDealerValue , playerWon , itsATie , playerLost);

        }


}

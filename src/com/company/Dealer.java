package com.company;


import java.util.Scanner;
import java.util.ArrayList;

public class Dealer {

    public ArrayList<Card> getPlayer() { return player; }
    public ArrayList<Card> getDealer() { return dealer; }

    private ArrayList<Card> player = new ArrayList<>();
    private ArrayList<Card> dealer = new ArrayList<>();

    private boolean gameOver = false;
    private boolean canSplit = false;
    private boolean canDoubleDown = false;
    private boolean hasDoubleDown = false;
    private boolean playerHasStopped = false;
    private boolean dealerHasStopped = false;



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


        player.add(deck.deck.get(0));
        deck.deck.remove(0);

        dealer.add(deck.deck.get(0));
        deck.deck.remove(0);

        player.add(deck.deck.get(0));
        deck.deck.remove(0);

        dealer.add(deck.deck.get(0));
        deck.deck.remove(0);


        System.out.println("Player card 1: " + player.get(0).value + " of " + player.get(0).suit + " " +  player.get(0).face );

        System.out.println("Player card 2: " + player.get(1).value + " of " + player.get(1).suit + " " +  player.get(1).face );

        System.out.println("Dealer card 1: " + dealer.get(0).value + " of " + dealer.get(0).suit  + " " +  dealer.get(0).face);

        System.out.println("Dealer card 2: is hidden");

        for (Card card : player) {
            print.printCard(card , player);
        }
        print.printCard(dealer.get(0) , dealer );

        print.blankCard();





        checkPoints();

        print.gamePlay();


        gamePlay();



    }





    public void gamePlay() {
        Scanner in = new Scanner(System.in);


        // (1) = hit / (2) = stand / (3) = double down / (4) split

        while (!gameOver) {


            while (!in.hasNextInt()) {
                System.err.println("Input must be a number showed on the screen!");
                in.next();
            }

            int input = in.nextInt();

            while (true) {
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
                in.next();
            }


            switch (input) {
                case 1:
                    player.add(deck.deck.get(0));
                    deck.deck.remove(0);

                    print.printCard(player.get(player.size() - 1) , player);


                    // Print updated player UI


                    checkPoints();
                    break;
                case 2:
                    // Stand

                    playerHasStopped = true;

                    dealerDraw();


                break;

/*
                case 3:
                    // Double down
                    player.add(deck.deck.get(0));



                case 4:
                    // Split
*/
            }


        }

    }


    private void checkPoints() {

        updateCardValue();


        if (totalPlayerValue < 21 && !playerHasStopped) {
            System.out.println("Your total value is " + totalPlayerValue);



            System.out.println("What would you like to do now?");
            System.out.println("(1) = hit / (2) = stand");
        }

        if (totalPlayerValue > 21) {
            print.lose();
        }

        else if (totalDealerValue > 21) {
            print.win();
        }

        else if (totalPlayerValue == totalDealerValue && playerHasStopped && totalPlayerValue <= 21){
            print.tie();
        }

        else if (totalPlayerValue == 21 && !dealerHasStopped) {
            playerHasStopped = true;
            dealerDraw();
        }

        else if (totalPlayerValue <= 21 && totalDealerValue > 21) {
            print.win();
        }
        else if (totalPlayerValue < totalDealerValue && playerHasStopped && dealerHasStopped ) {
            print.lose();
        }

        else if (totalPlayerValue == 21 && dealerHasStopped && playerHasStopped && totalDealerValue != 21) {
            print.win();
        }





    }


    public void dealerDraw() {
        updateCardValue();





        System.out.println("Dealer draws?");

        System.out.println("hidden card is:");
        print.printCard(dealer.get(1) , dealer);


        System.out.println("dealer total is " + totalDealerValue);
        // dealer values is under 16 and the value of the dealer is smaller than the player
        while (totalDealerValue < 17 && totalDealerValue < totalPlayerValue) {

            dealer.add(deck.deck.get(0));
            deck.deck.remove(0);

            print.printCard(dealer.get(dealer.size() - 1) , dealer);

            updateCardValue();

            System.out.println("Dealer total is:  " + totalDealerValue);
            System.out.println("Your total is: " + totalPlayerValue);

        }

        dealerHasStopped = true;
        checkPoints();

    }


    private void updateCardValue() {
        totalDealerValue = 0;
        totalPlayerValue = 0;


        for (Card  card : player ){
            totalPlayerValue += card.value;
        }
        for (Card  card : player ){
            if (totalPlayerValue <= 11 && card.isAce) {
                totalPlayerValue += 10;
            }
        }

        for (Card  card : dealer ){
            if (playerHasStopped) {

            totalDealerValue += card.value;} else {
                totalDealerValue = dealer.get(0).value;
            }

        }
        for (Card  card : dealer ){
            if (totalDealerValue <= 11 && card.isAce) {
                totalDealerValue += 10;
            }
        }

    }


}

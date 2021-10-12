package com.company;

import java.util.ArrayList;

public class Printer {


    ArrayList<String> gameScreen = new ArrayList<>();

    ArrayList<StringBuilder> cardGamePlay = new ArrayList<>();

    public void startGame() {


        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("                 __       __            __                                                      __                      _______   __                      __                                     __       ");
        System.out.println("                |  \\  _  |  \\          |  \\                                                    |  \\                    |       \\ |  \\                    |  \\                                   |  \\      ");
        System.out.println("                | $$ / \\ | $$  ______  | $$  _______   ______   ______ ____    ______         _| $$_     ______        | $$$$$$$\\| $$  ______    _______ | $$   __       __   ______    _______ | $$   __ ");
        System.out.println("                | $$/  $\\| $$ /      \\ | $$ /       \\ /      \\ |      \\    \\  /      \\       |   $$ \\   /      \\       | $$__/ $$| $$ |      \\  /       \\| $$  /  \\     |  \\ |      \\  /       \\| $$  /  \\");
        System.out.println("                | $$  $$$\\ $$|  $$$$$$\\| $$|  $$$$$$$|  $$$$$$\\| $$$$$$\\$$$$\\|  $$$$$$\\       \\$$$$$$  |  $$$$$$\\      | $$    $$| $$  \\$$$$$$\\|  $$$$$$$| $$_/  $$      \\$$  \\$$$$$$\\|  $$$$$$$| $$_/  $$");
        System.out.println("                | $$ $$\\$$\\$$| $$    $$| $$| $$      | $$  | $$| $$ | $$ | $$| $$    $$        | $$ __ | $$  | $$      | $$$$$$$\\| $$ /      $$| $$      | $$   $$      |  \\ /      $$| $$      | $$   $$ ");
        System.out.println("                | $$$$  \\$$$$| $$$$$$$$| $$| $$_____ | $$__/ $$| $$ | $$ | $$| $$$$$$$$        | $$|  \\| $$__/ $$      | $$__/ $$| $$|  $$$$$$$| $$_____ | $$$$$$\\      | $$|  $$$$$$$| $$_____ | $$$$$$\\ ");
        System.out.println("                | $$$    \\$$$ \\$$     \\| $$ \\$$     \\ \\$$    $$| $$ | $$ | $$ \\$$     \\         \\$$  $$ \\$$    $$      | $$    $$| $$ \\$$    $$ \\$$     \\| $$  \\$$\\     | $$ \\$$    $$ \\$$     \\| $$  \\$$\\");
        System.out.println("                 \\$$      \\$$  \\$$$$$$$ \\$$  \\$$$$$$$  \\$$$$$$  \\$$  \\$$  \\$$  \\$$$$$$$          \\$$$$   \\$$$$$$        \\$$$$$$$  \\$$  \\$$$$$$$  \\$$$$$$$ \\$$   \\$$__   | $$  \\$$$$$$$  \\$$$$$$$ \\$$   \\$$");
        System.out.println("                                                                                                                                                                  |  \\__/ $$                             ");
        System.out.println("                                                                                                                                                                   \\$$    $$                             ");
        System.out.println("                                                                                                                                                                    \\$$$$$$                              ");

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }

        System.out.println("                                                                                                     You have " + Main.currency + "$");
        System.out.println("                                                                                         Type how much you would like to bet");

        for (int i = 0; i < 25; i++) {
            System.out.println();
        }

    }

    public void congratulations() {

        System.out.println("  ______                                                     __                __             __      __                                __ ");
        System.out.println(" /      \\                                                   |  \\              |  \\           |  \\    |  \\                              |  \\");
        System.out.println("|  $$$$$$\\  ______   _______    ______    ______   ______  _| $$_    __    __ | $$  ______  _| $$_    \\$$  ______   _______    _______ | $$");
        System.out.println("| $$   \\$$ /      \\ |       \\  /      \\  /      \\ |      \\|   $$ \\  |  \\  |  \\| $$ |      \\|   $$ \\  |  \\ /      \\ |       \\  /       \\| $$");
        System.out.println("| $$      |  $$$$$$\\| $$$$$$$\\|  $$$$$$\\|  $$$$$$\\ \\$$$$$$\\\\$$$$$$  | $$  | $$| $$  \\$$$$$$\\\\$$$$$$  | $$|  $$$$$$\\| $$$$$$$\\|  $$$$$$$| $$");
        System.out.println("| $$   __ | $$  | $$| $$  | $$| $$  | $$| $$   \\$$/      $$ | $$ __ | $$  | $$| $$ /      $$ | $$ __ | $$| $$  | $$| $$  | $$ \\$$    \\  \\$$");
        System.out.println("| $$__/  \\| $$__/ $$| $$  | $$| $$__| $$| $$     |  $$$$$$$ | $$|  \\| $$__/ $$| $$|  $$$$$$$ | $$|  \\| $$| $$__/ $$| $$  | $$ _\\$$$$$$\\ __ ");
        System.out.println(" \\$$    $$ \\$$    $$| $$  | $$ \\$$    $$| $$      \\$$    $$  \\$$  $$ \\$$    $$| $$ \\$$    $$  \\$$  $$| $$ \\$$    $$| $$  | $$|       $$|  \\");
        System.out.println("  \\$$$$$$   \\$$$$$$  \\$$   \\$$ _\\$$$$$$$ \\$$       \\$$$$$$$   \\$$$$   \\$$$$$$  \\$$  \\$$$$$$$   \\$$$$  \\$$  \\$$$$$$  \\$$   \\$$ \\$$$$$$$  \\$$");
        System.out.println("                              |  \\__| $$                                                                                                   ");
        System.out.println("                               \\$$    $$                                                                                                   ");
        System.out.println("                                \\$$$$$$                                                                                                    ");

    }

    public void printCard(Card card , ArrayList<Card> player )  {


        String fill = " ";

        String num = "";
        String symbol ="";

        if (card.face == null) {
            num = String.valueOf( card.value);
        } else {
            num = switch (card.face) {
                case "Ace" -> "A";
                case "Jack" -> "J";
                case "Queen" -> "Q";
                case "King" -> "K";
                default -> num;
            };
        }

        assert card.suit != null;
        symbol = switch (card.suit) {
            case "Hearts" -> "♥";
            case "Spades" -> "♠";
            case "Clubs" -> "♣";
            case "Diamonds" -> "♦";
           default ->  symbol;
        };


        if (card.value == 10 && card.face == null  ) {
            fill = "";
        }


        String spaceSize ="";

        // brug følgende symboler: ♥ ♠ ♦ ♣

        int numberOfPlayerCards =  player.size();

        switch (numberOfPlayerCards) {
            case 2 -> spaceSize = "\t\t\t\t\t\t\t\t     ";
            case 3 -> spaceSize = "\t\t\t\t\t\t";
        }


        if (cardGamePlay.size() == 0) {

            cardGamePlay.add(new StringBuilder(spaceSize)); // 0
            cardGamePlay.add(new StringBuilder(spaceSize)); // 1
            cardGamePlay.add(new StringBuilder(spaceSize)); // 2
            cardGamePlay.add(new StringBuilder(spaceSize)); // 3
            cardGamePlay.add(new StringBuilder(spaceSize)); // 4
            cardGamePlay.add(new StringBuilder(spaceSize)); // 5
            cardGamePlay.add(new StringBuilder(spaceSize)); // 6
            cardGamePlay.add(new StringBuilder(spaceSize)); // 7
            cardGamePlay.add(new StringBuilder(spaceSize)); // 8
            cardGamePlay.add(new StringBuilder(spaceSize)); // 9
        }


        cardGamePlay.get(0).append (" ___________ \t\t");
        cardGamePlay.get(1).append ("/           \\\t\t");
        cardGamePlay.get(2).append("| ").append(num).append("     ").append(fill).append(fill).append(num).append(" |\t\t");
        cardGamePlay.get(3).append("| ").append(symbol).append("       ").append(symbol).append(" |\t\t");
        cardGamePlay.get(4).append("|           |\t\t");
        cardGamePlay.get(5).append("|     ").append(symbol).append("     |\t\t");
        cardGamePlay.get(6).append("|           |\t\t");
        cardGamePlay.get(7).append("| ").append(symbol).append("       ").append(symbol).append(" |\t\t");
        cardGamePlay.get(8).append("| ").append(num).append("     ").append(fill).append(fill).append(num).append(" |\t\t");
        cardGamePlay.get(9).append("\\___________/\t\t");


        if (player.get( player.size() - 1 )  == card) {

            for (int i = 0; i < 10; i++) {
                cardGamePlay.get(i).append(spaceSize);
            }

            for (int i = 0; i < 10; i++) {
                cardGamePlay.get(i).append(" |");
            }
        }




        }











    public void blankCard() {
 /*       System.out.println(" ___________ ");
        System.out.println("/           \\");
        System.out.println("| /  /  /  /|");
        System.out.println("|/  /  /  / |");
        System.out.println("|  /  /  /  |");
        System.out.println("| /  /  /  /|");
        System.out.println("|/  /  /  / |");
        System.out.println("|  /  /  /  |");
        System.out.println("| /  /  /  /|");
        System.out.println("\\___________/");
*/
        System.out.println(" ___________ ");
        System.out.println("/   _---_   \\");
        System.out.println("|  /     \\  |");
        System.out.println("|  \\     /  |");
        System.out.println("|       /   |");
        System.out.println("|      |    |");
        System.out.println("|      |    |");
        System.out.println("|      |    |");
        System.out.println("|      *    |");
        System.out.println("\\___________/");
    }


    public void gamePlay() {

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        Dealer dealer = new Dealer();






        StringBuilder length = new StringBuilder();
        StringBuilder normalLength = new StringBuilder();
        String namePlusS = "";

        normalLength.append(" ".repeat(113));

        int spaceLength = 113 / 2;
        String lengthFixer = "";



        if (Main.name != null) {
            namePlusS = Main.name + "'s turn";
            if (namePlusS.length() % 2 == 0) { spaceLength =  ((113  - namePlusS.length()  ) / 2) ; lengthFixer = " "; }
            else { spaceLength =  ((113  - namePlusS.length() + 1 ) / 2) ;}
        }
        length.append(" ".repeat(spaceLength));


        String smallSpace = "    ";
        int smallIntSpace = 11;

        if (dealer.getTotalDealerValue() > 9) {smallIntSpace = 10; }
        if (dealer.getTotalPlayerValue() > 9) {  smallSpace = "   "; }



        gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
        gameScreen.add("|" + length + namePlusS +  length + lengthFixer + "|" + normalLength + "|" );
        gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
        gameScreen.add(" " + normalLength + "|" + normalLength + " ");
        gameScreen.add(" " + Main.name + "(" + dealer.getTotalPlayerValue() + ")" + length + length  +"    "  + "|" + normalLength.delete(0,smallIntSpace) +  "(" + dealer.getTotalDealerValue() + ")  " + "András ");
        normalLength.append(" ".repeat(smallIntSpace));
        gameScreen.add(" " + normalLength + "|" + normalLength + " ");

        gameScreen.add(cardGamePlay.get(0).toString() );
        gameScreen.add(cardGamePlay.get(1).toString() );
        gameScreen.add(cardGamePlay.get(2).toString() );
        gameScreen.add(cardGamePlay.get(3).toString() );
        gameScreen.add(cardGamePlay.get(4).toString() );
        gameScreen.add(cardGamePlay.get(5).toString() );
        gameScreen.add(cardGamePlay.get(6).toString() );
        gameScreen.add(cardGamePlay.get(7).toString() );
        gameScreen.add(cardGamePlay.get(8).toString() );
        gameScreen.add(cardGamePlay.get(9).toString() );

        for ( String list: gameScreen) {
            System.out.println(list);
        }


    }

    public void gameOver() {
        System.out.println("  ______    ______   __       __  ________         ______   __     __  ________  _______  ");
        System.out.println(" /      \\  /      \\ |  \\     /  \\|        \\       /      \\ |  \\   |  \\|        \\|       \\ ");
        System.out.println("|  $$$$$$\\|  $$$$$$\\| $$\\   /  $$| $$$$$$$$      |  $$$$$$\\| $$   | $$| $$$$$$$$| $$$$$$$\\");
        System.out.println("| $$ __\\$$| $$__| $$| $$$\\ /  $$$| $$__          | $$  | $$| $$   | $$| $$__    | $$__| $$");
        System.out.println("| $$|    \\| $$    $$| $$$$\\  $$$$| $$  \\         | $$  | $$ \\$$\\ /  $$| $$  \\   | $$    $$");
        System.out.println("| $$ \\$$$$| $$$$$$$$| $$\\$$ $$ $$| $$$$$         | $$  | $$  \\$$\\  $$ | $$$$$   | $$$$$$$\\");
        System.out.println("| $$__| $$| $$  | $$| $$ \\$$$| $$| $$_____       | $$__/ $$   \\$$ $$  | $$_____ | $$  | $$");
        System.out.println(" \\$$    $$| $$  | $$| $$  \\$ | $$| $$     \\       \\$$    $$    \\$$$   | $$     \\| $$  | $$");
        System.out.println("  \\$$$$$$  \\$$   \\$$ \\$$      \\$$ \\$$$$$$$$        \\$$$$$$      \\$     \\$$$$$$$$ \\$$   \\$$\n");
    }


    public void win() {
        congratulations();
        System.out.println("\nYou won $" + (Main.betSize * 2) + " your new balance is $" + (Main.betSize + Main.currency) + ".");
    }

    public void lose() {
        //sejt statement
        System.out.println("\nYou lost $" + (Main.betSize) + " your new balance is $" + (Main.currency) + ".");
    }

    public void tie() {
        //sejt statement
        System.out.println("It was a draw your bet of $" + (Main.betSize) + " has been returned to your wallet and your new balance is $" + (Main.currency + Main.betSize) + ".");
    }

    public void status() {

        // Change the bets and currency so they fit with the entire game.

        int bet = 1;
        int current = 500;
        String empty = "|                                                                                |";
        String space = " ";

        System.out.println("+--------------------------------------------------------------------------------+");
        System.out.println(empty);
        System.out.println(empty);
        System.out.println("|                         Current bet:\t\t\t$" + bet + (space.repeat(32 - String.valueOf(bet).length())) + "|");
        System.out.println(empty);
        System.out.println("|                         Total amount:\t\t\t$" + current + (space.repeat(32 - String.valueOf(current).length())) + "|");
        System.out.println(empty);
        System.out.println(empty);
        System.out.println("+--------------------------------------------------------------------------------+");
    }

}

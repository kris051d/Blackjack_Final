package com.company;

import java.util.ArrayList;

public class Printer {


    ArrayList<String> status = new ArrayList<>();

    ArrayList<String> gameScreen = new ArrayList<>();

    ArrayList<StringBuilder> cardGamePlay = new ArrayList<>();

    ArrayList<StringBuilder> options = new ArrayList<>();

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

        rules();

        System.out.println("                                                                                                     You have " + Main.currency + "$");
        System.out.println("                                                                                         Type how much you would like to bet");

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

    }



    public void congratulations() {


        status.add("\t\t\t\t\t\t\t\t\t\t  ______                                                     __                __             __      __                                __ ");
        status.add("\t\t\t\t\t\t\t\t\t\t /      \\                                                   |  \\              |  \\           |  \\    |  \\                              |  \\");
        status.add("\t\t\t\t\t\t\t\t\t\t|  $$$$$$\\  ______   _______    ______    ______   ______  _| $$_    __    __ | $$  ______  _| $$_    \\$$  ______   _______    _______ | $$");
        status.add("\t\t\t\t\t\t\t\t\t\t| $$   \\$$ /      \\ |       \\  /      \\  /      \\ |      \\|   $$ \\  |  \\  |  \\| $$ |      \\|   $$ \\  |  \\ /      \\ |       \\  /       \\| $$");
        status.add("\t\t\t\t\t\t\t\t\t\t| $$      |  $$$$$$\\| $$$$$$$\\|  $$$$$$\\|  $$$$$$\\ \\$$$$$$\\\\$$$$$$  | $$  | $$| $$  \\$$$$$$\\\\$$$$$$  | $$|  $$$$$$\\| $$$$$$$\\|  $$$$$$$| $$");
        status.add("\t\t\t\t\t\t\t\t\t\t| $$   __ | $$  | $$| $$  | $$| $$  | $$| $$   \\$$/      $$ | $$ __ | $$  | $$| $$ /      $$ | $$ __ | $$| $$  | $$| $$  | $$ \\$$    \\  \\$$");
        status.add("\t\t\t\t\t\t\t\t\t\t| $$__/  \\| $$__/ $$| $$  | $$| $$__| $$| $$     |  $$$$$$$ | $$|  \\| $$__/ $$| $$|  $$$$$$$ | $$|  \\| $$| $$__/ $$| $$  | $$ _\\$$$$$$\\ __ ");
        status.add("\t\t\t\t\t\t\t\t\t\t \\$$    $$ \\$$    $$| $$  | $$ \\$$    $$| $$      \\$$    $$  \\$$  $$ \\$$    $$| $$ \\$$    $$  \\$$  $$| $$ \\$$    $$| $$  | $$|       $$|  \\");
        status.add("\t\t\t\t\t\t\t\t\t\t  \\$$$$$$   \\$$$$$$  \\$$   \\$$ _\\$$$$$$$ \\$$       \\$$$$$$$   \\$$$$   \\$$$$$$  \\$$  \\$$$$$$$   \\$$$$  \\$$  \\$$$$$$  \\$$   \\$$ \\$$$$$$$  \\$$");
        status.add("\t\t\t\t\t\t\t\t\t\t                              |  \\__| $$                                                                                                   ");
        status.add("\t\t\t\t\t\t\t\t\t\t                               \\$$    $$                                                                                                   ");
        status.add("\t\t\t\t\t\t\t\t\t\t                                \\$$$$$$                                                                                                    ");

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
            case 2 -> spaceSize = "\t\t\t\t\t\t\t\t   ";
            case 3 -> spaceSize = "\t\t\t\t\t      ";
            case 4 -> spaceSize = "\t\t\t\t";
            case 5 -> spaceSize = "\t  ";
        }


        if (cardGamePlay.size() == 0 && player.get(0) == card) {

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
        } else if (player.get(0) == card) {
            for (int i = 0; i < 10; i++) {
                cardGamePlay.get(i).append("  ").append(spaceSize);
            }
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
                if (numberOfPlayerCards == 3) {
                cardGamePlay.get(i).append("    |");
            }   else if (numberOfPlayerCards == 2) {
                cardGamePlay.get(i).append("   |");
            }else if (numberOfPlayerCards == 4) {
                    cardGamePlay.get(i).append("  |");
                } else {
                    cardGamePlay.get(i).append("    |");
                }
            }
        }




        }











    public void blankCard() {
        cardGamePlay.get(0).append( " ___________ ");
        cardGamePlay.get(1).append("/           \\");
        cardGamePlay.get(2).append("| /  /  /  /|");
        cardGamePlay.get(3).append("|/  /  /  / |");
        cardGamePlay.get(4).append("|  /  /  /  |");
        cardGamePlay.get(5).append("| /  /  /  /|");
        cardGamePlay.get(6).append("|/  /  /  / |");
        cardGamePlay.get(7).append("|  /  /  /  |");
        cardGamePlay.get(8).append("| /  /  /  /|");
        cardGamePlay.get(9).append("\\___________/");


    }


    public void gamePlay(int playerTotal, int dealerTotal, boolean playerwon, boolean itsATie, boolean playerLost) {

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

        if (dealerTotal > 9) {smallIntSpace = 12; }

        if (playerTotal <= 9 && Main.name.length() %  2 == 0) {  smallSpace = "  "; }
        if (playerTotal <= 9 && Main.name.length() %  2 != 0) {  smallSpace = "   "; }

        if (playerTotal > 9 && Main.name.length() %  2 == 0) {  smallSpace = " "; }
        if (playerTotal > 9 && Main.name.length() %  2 != 0) {  smallSpace = "  "; }

        if (!Dealer.playerHasStopped) {
            gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
            gameScreen.add("|" + length + namePlusS + length + lengthFixer + "|" + normalLength + "|");
            gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
            gameScreen.add(" " + normalLength + "|" + normalLength + " ");
            gameScreen.add(" " + Main.name + "  (" + playerTotal + ")" + length + length + smallSpace + "|" + normalLength.delete(0, smallIntSpace) + "(" + dealerTotal + ")  " + "András ");
            normalLength.append(" ".repeat(smallIntSpace));
            gameScreen.add(" " + normalLength + "|" + normalLength + " ");
        } else if (Dealer.playerHasStopped) {
            gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
            gameScreen.add("|" + normalLength + "|" + length + "András' turn" + length + lengthFixer + "|");
            gameScreen.add("+-----------------------------------------------------------------------------------------------------------------+-----------------------------------------------------------------------------------------------------------------+");
            gameScreen.add(" " + normalLength + "|" + normalLength + " ");
            gameScreen.add(" " + Main.name + "  (" + playerTotal + ")" + length + length + smallSpace + "|" + normalLength.delete(0, smallIntSpace) + "(" + dealerTotal + ")  " + "András ");
            normalLength.append(" ".repeat(smallIntSpace));
            gameScreen.add(" " + normalLength + "|" + normalLength + " ");
        }


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

        gameScreen.add(" " + normalLength + "|" + normalLength + " ");
        gameScreen.add(" " + normalLength + "|" + normalLength + " ");
        gameScreen.add(" " + normalLength + "|" + normalLength + " ");


        gameScreen.addAll(status);

            gameScreen.add("");
            gameScreen.add("");

        for (StringBuilder options : options) {
            gameScreen.add(options.toString());
        }

        if (!playerwon && !itsATie) {
            gameScreen.add("");
            gameScreen.add("");
        }

            gameScreen.add("");


        if (playerLost) {
            gameScreen.add("");
        }

        for ( String list: gameScreen) {
            System.out.println(list);
        }

    }

    public void gameOver() {

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        System.out.println((" ").repeat(70) + "  ______    ______   __       __  ________         ______   __     __  ________  _______  ");
        System.out.println((" ").repeat(70) + " /      \\  /      \\ |  \\     /  \\|        \\       /      \\ |  \\   |  \\|        \\|       \\ ");
        System.out.println((" ").repeat(70) + "| $$ __\\$$| $$__| $$| $$$\\ /  $$$| $$__          | $$  | $$| $$   | $$| $$__    | $$__| $$");
        System.out.println((" ").repeat(70) + "|  $$$$$$\\|  $$$$$$\\| $$\\   /  $$| $$$$$$$$      |  $$$$$$\\| $$   | $$| $$$$$$$$| $$$$$$$\\");
        System.out.println((" ").repeat(70) + "| $$|    \\| $$    $$| $$$$\\  $$$$| $$  \\         | $$  | $$ \\$$\\ /  $$| $$  \\   | $$    $$");
        System.out.println((" ").repeat(70) + "| $$ \\$$$$| $$$$$$$$| $$\\$$ $$ $$| $$$$$         | $$  | $$  \\$$\\  $$ | $$$$$   | $$$$$$$\\");
        System.out.println((" ").repeat(70) + "| $$__| $$| $$  | $$| $$ \\$$$| $$| $$_____       | $$__/ $$   \\$$ $$  | $$_____ | $$  | $$");
        System.out.println((" ").repeat(70) + " \\$$    $$| $$  | $$| $$  \\$ | $$| $$     \\       \\$$    $$    \\$$$   | $$     \\| $$  | $$");
        System.out.println((" ").repeat(70) + "  \\$$$$$$  \\$$   \\$$ \\$$      \\$$ \\$$$$$$$$        \\$$$$$$      \\$     \\$$$$$$$$ \\$$   \\$$\n");

        for (int i = 0; i < 15; i++) {
            System.out.println();
        }


    }


    public void win() {
        congratulations();
        String empty = "|                                                                                |";
        String space = " ";
        String middleSpaces = (" ").repeat(73);

        options.add( new StringBuilder(middleSpaces + "+--------------------------------------------------------------------------------+"));
        options.add(new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + "|" + (" ").repeat(15) + "You won! You received double your money back ($" + Main.betSize * 2 + ")." + (" ").repeat(16 - String.valueOf(Main.betSize * 2).length()) + "|"));
        options.add( new StringBuilder( middleSpaces + "|" + (" ").repeat(28) + "Your new total is: ($" + (Main.currency + Main.betSize * 2) + (")") + (" ").repeat(30 - String.valueOf(Main.currency + Main.betSize * 2).length()) + "|"));
        options.add( new StringBuilder( middleSpaces + "|  \tTo play again type what you would like to bet or type \" Exit \" to exit \t  |"  ));
        options.add( new StringBuilder( middleSpaces + empty)) ;
        options.add( new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + "+--------------------------------------------------------------------------------+\t\t\t"));



//        System.out.println("\nYou won $" + (Main.betSize * 2) + " your new balance is $" + (Main.betSize * 2  + Main.currency) + ".");
        Main.currency += Main.betSize * 2;

    }

    public void lose() {

        youLose();

        String empty = "|                                                                                |";
        String space = " ";
        String middleSpaces = (" ").repeat(73);

        options.add( new StringBuilder(middleSpaces + "+--------------------------------------------------------------------------------+"));
        options.add(new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + "|" + (" ").repeat(15) + "You lost! You lost ($" + Main.betSize + ") your new balance is ($" + Main.currency + (")") + (" ").repeat(19 - String.valueOf(Main.currency).length() - String.valueOf(Main.betSize).length()) + ("|")));
        options.add( new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + "|  \tTo play again type what you would like to bet or type \" Exit \" to exit \t  |"  ));
        options.add( new StringBuilder( middleSpaces + empty)) ;
        options.add( new StringBuilder( middleSpaces + empty));
        options.add( new StringBuilder( middleSpaces + "+--------------------------------------------------------------------------------+\t\t\t"));


    }

    public void tie() {


        push();

        String empty = "|                                                                                |";
        String middleSpaces = (" ").repeat(73);

        options.add(new StringBuilder(middleSpaces + "+--------------------------------------------------------------------------------+"));
        options.add(new StringBuilder(middleSpaces + empty));
        options.add(new StringBuilder(middleSpaces + empty));
        options.add(new StringBuilder(middleSpaces + "|        It's a tie you get your bet back ($" + Main.betSize + "), your balance is: ($" + (Main.currency + Main.betSize) + (")") + (" ").repeat(12 - String.valueOf(Main.betSize).length() - String.valueOf(Main.currency).length()) + "|"));
        options.add(new StringBuilder(middleSpaces + empty));
        options.add(new StringBuilder(middleSpaces + "|  \tTo play again type what you would like to bet or type \" Exit \" to exit \t  |"  ));
        options.add(new StringBuilder(middleSpaces + empty)) ;
        options.add(new StringBuilder(middleSpaces + empty));
        options.add(new StringBuilder(middleSpaces + "+--------------------------------------------------------------------------------+\t\t\t"));

        Main.currency += Main.betSize;

    }

    public void push() {
        status.add((" ").repeat(90) + " _______   __    __   ______   __    __  __ ");
        status.add((" ").repeat(90) + "|       \\ |  \\  |  \\ /      \\ |  \\  |  \\|  \\");
        status.add((" ").repeat(90) + "| $$$$$$$\\| $$  | $$|  $$$$$$\\| $$  | $$| $$");
        status.add((" ").repeat(90) + "| $$__/ $$| $$  | $$| $$___\\$$| $$__| $$| $$");
        status.add((" ").repeat(90) + "| $$    $$| $$  | $$ \\$$    \\ | $$    $$| $$");
        status.add((" ").repeat(90) + "| $$$$$$$ | $$  | $$ _\\$$$$$$\\| $$$$$$$$ \\$$");
        status.add((" ").repeat(90) + "| $$      | $$__/ $$|  \\__| $$| $$  | $$ __ ");
        status.add((" ").repeat(90) + "| $$       \\$$    $$ \\$$    $$| $$  | $$|  \\");
        status.add((" ").repeat(90) + " \\$$        \\$$$$$$   \\$$$$$$  \\$$   \\$$ \\$$");
        status.add("");
        status.add("");
        status.add("");
    }

    public void youLose() {
        status.add((" ").repeat(76) + " __      __                          __                                __ ");
        status.add((" ").repeat(76) + "|  \\    /  \\                        |  \\                              |  \\");
        status.add((" ").repeat(76) + " \\$$\\  /  $$______   __    __       | $$  ______    _______   ______  | $$");
        status.add((" ").repeat(76) + "  \\$$\\/  $$/      \\ |  \\  |  \\      | $$ /      \\  /       \\ /      \\ | $$");
        status.add((" ").repeat(76) + "   \\$$  $$|  $$$$$$\\| $$  | $$      | $$|  $$$$$$\\|  $$$$$$$|  $$$$$$\\| $$");
        status.add((" ").repeat(76) + "    \\$$$$ | $$  | $$| $$  | $$      | $$| $$  | $$ \\$$    \\ | $$    $$ \\$$");
        status.add((" ").repeat(76) + "    | $$  | $$__/ $$| $$__/ $$      | $$| $$__/ $$ _\\$$$$$$\\| $$$$$$$$ __ ");
        status.add((" ").repeat(76) + "    | $$   \\$$    $$ \\$$    $$      | $$ \\$$    $$|       $$ \\$$     \\|  \\");
        status.add((" ").repeat(76) + "     \\$$    \\$$$$$$   \\$$$$$$        \\$$  \\$$$$$$  \\$$$$$$$   \\$$$$$$$ \\$$");
    }

    public void rules() {
        System.out.println("The rules are as following: ");
        System.out.println("You will try to beat the dealer by getting a count as close to 21 as possible, without going over 21. Aces counts as w");
        System.out.println("Every round you will be able to place a bet. Winning the game will return the your bet double, getting a tie gives you back your bet and losing will make you lose your bet.");
        System.out.println("You start with 2 cards and the dealer will start with 2 cards, where one of them is hidden.");
        System.out.println("You have the options to either hit, meaning you want another card, or stand, meaning you don't want another card.");
        System.out.println("After you have chosen to stand, the dealer will try and beat your count.\n");
        System.out.println("Double down:");
        System.out.println("When you start with two cards, you will have the opportunity to chose \"double down\"");
        System.out.println("If you chooses this, you will only be granted one more card and your bet will be doubled.\n\n\n\n");
    }


    public void status(int bet, int current, boolean canDoubleDown , boolean playerWon ,  boolean itsATie, boolean playerLost) {


        // Change the bets and currency so they fit with the entire game.

        String empty = "|                                                                                |";
        String space = " ";
        String middleSpaces = (" ").repeat(73);

        status.add(middleSpaces + "+--------------------------------------------------------------------------------+");
        status.add(middleSpaces + empty);
        status.add(middleSpaces + empty);
        status.add(middleSpaces + "|                         Current bet:\t\t\t$" + bet + (space.repeat(33 - String.valueOf(bet).length())) + "|");
        status.add(middleSpaces + empty);
        status.add(middleSpaces + "|                         Balance:\t\t\t\t$" + current + (space.repeat(33 - String.valueOf(current).length())) + "|");
        status.add(middleSpaces + empty);
        status.add(middleSpaces + empty);
        status.add(middleSpaces + "+--------------------------------------------------------------------------------+\n\n\n");



        options.add(new StringBuilder("\t\t\t\t\t\t+--------------------+  \t\t\t\t\t\t\t  +--------------------+\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t|                    |  \t\t\t\t\t\t\t  |                    |\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t|         1          |  \t\t\t\t\t\t\t  |         2          |\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t|                    |  \t\t\t\t\t\t\t  |                    |\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t|        HIT         |  \t\t\t\t\t\t\t  |       STAND        |\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t|                    |  \t\t\t\t\t\t\t  |                    |\t\t\t\t\t\t\t"));
        options.add(new StringBuilder("\t\t\t\t\t\t+--------------------+  \t\t\t\t\t\t\t  +--------------------+\t\t\t\t\t\t\t"));


        if (canDoubleDown) {

            options.get(0).append("+--------------------+");
            options.get(1).append("|                    |");
            options.get(2).append("|         3          |");
            options.get(3).append("|                    |");
            options.get(4).append("|    DOUBLE DOWN     |");
            options.get(5).append("|                    |");
            options.get(6).append("+--------------------+");


        }


        if (playerWon) {

            status.clear();
            options.clear();

            win();

        }

        if (itsATie) {

            status.clear();
            options.clear();

            tie();
        }

        if (playerLost) {

            status.clear();

            options.clear();

            lose();
        }


    }

}

package com.company;


import com.sun.source.tree.WhileLoopTree;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {





    public static  String name;

    public static int currency = 500;
    public static int betSize;
    public static  boolean gameIsRunning = true;



    public static void main(String[] arg) {

        Printer print = new Printer();
        Scanner in = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Wallet wallet = new Wallet();


        System.out.println("Welcome to Blackjack! What's your first name?");
        name = in.nextLine();

        print.startGame();

        while (true) {

            outLoop:
            while (gameIsRunning) {


                while (true) {


                    String input = in.next();


                    if (input.toLowerCase(Locale.ROOT).equals("exit")) {
                        System.out.println("Exiting Blackjack");
                        System.exit(0);
                    }

                    try {

                        betSize = Integer.parseInt(input);

                    } catch (Exception e) {
                        System.err.println("That is not a valid number or \"Exit\" ");
                        break outLoop;
                    }


                    if (betSize <= currency && betSize > 0) {
                        System.out.println("Bet size is now $" + betSize + "\nDealing...");
                        break;
                    } else if (betSize > currency) {
                        System.err.println("You do not have that amount of currency.");
                    } else {
                        System.err.println("You need to bet a whole positive number");
                    }

                }


                wallet.play();

                dealer.generateDeck();
                dealer.startDeal();


                if (currency == 0) {


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    print.gameOver();
                    System.exit(0);
                }

            }

        }
    }
}
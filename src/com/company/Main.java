package com.company;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Scanner;

public class Main {





    public static int currency = 500;
    public static int betSize;


    public static void main(String[] arg) {
        Printer print = new Printer();


        Scanner in = new Scanner(System.in);


        print.startGame();



        while(!in.hasNextInt()) {
            System.err.println("Not a valid number");
            in.next();
        }

        while (in.hasNextInt()) {
            betSize = in.nextInt();
            if (betSize <= currency && betSize > 0) {
                System.out.println("Bet size is now $" + betSize + "\nDealing...");
                break;
            } else if (betSize > currency) {
                System.err.println("You do not have that amount of currency.");
            } else {
                System.err.println("You need to bet a whole positive number");
            }
        }







        Card card = new Card();
        card.makeCard(6, "Heart");
        System.out.println(card.getFace() + " Hello");



        Wallet wallet = new Wallet();


        wallet.play();

        wallet.lose();
    }
}
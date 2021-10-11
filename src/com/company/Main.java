package com.company;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int currency = 500;



    public static void main(String[] arg) {
        int betSize = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!\n" + "You have $" +  currency + ", how much would you like to bet?");

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



       /* List<Integer> mylist = new ArrayList<Integer>();

        System.out.println(mylist);*/

    }
}
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> deck = new ArrayList<Card>();



    public void createDeck(int numOfDecks) {

        for (int y = 0; y < numOfDecks; y++) {

            //create Hears
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Hears");
            }
            //create Spades
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Spades");
            }
            //create Clubs
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Clubs");
            }
            //create Diamonds
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Diamonds");
            }


            Collections.shuffle(deck);

        }






    }







}

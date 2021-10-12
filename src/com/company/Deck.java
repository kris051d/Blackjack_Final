package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {



    public ArrayList<Card> deck = new ArrayList<>();



    public void createDeck(int numOfDecks) {

        for (int y = 0; y < numOfDecks; y++) {

            //create Hearts
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Hearts");
                deck.add(card);
            }
            //create Spades
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Spades");
                deck.add(card);
            }
            //create Clubs
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Clubs");
                deck.add(card);
            }
            //create Diamonds
            for (int i = 0; i < 13; i++) {
                Card card = new Card();
                card.makeCard(i + 1, "Diamonds");
                deck.add(card);
            }




        }

        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);




    }


    public ArrayList<Card> getDeck() { return deck; }




}

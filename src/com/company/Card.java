package com.company;

public class Card {

    public String face;
    public String suit;
    public int value;
    public boolean isFace;
    public boolean isAce;

    public String suitImg;

    public Card() {}

    public Card(int value, String suit) {
        setFace(value);
        setSuit(suit);
        setValue(value);
    }

    public void makeCard(int value , String suit) {
        setSuit(suit);
        setValue((value));
        setFace(value);
    }

    public String getFace() { return face; }

    public String getSuit() { return suit; }
    public void setSuit(String suit) { this.suit = suit; }

    public int getValue() {return  value; }
    public void setValue(int value)  {this.value = value; }


    //Gets the bool values
    public boolean isFace() { return isFace; }
    public boolean isAce()  { return isAce; }

    public void setFace(int value) {

        switch (value) {
            case 1 -> {
                this.face = "Ace";
                isAce = true;
            }
            case 11 -> {
                this.face = "Jack";
                setValue(10);
            }
            case 12 -> {
                this.face = "Queen";
                setValue(10);
            }
            case 13 -> {
                this.face = "King";
                setValue(10);
            }
        }

    }

}

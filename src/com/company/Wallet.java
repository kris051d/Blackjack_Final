package com.company;

public class Wallet {
    public int currency;
    public int betSize;
    Printer printer = new Printer();


    public void play() {
        Main.currency -= getBetSize();
    }


    public void win() {
        this.betSize =  getBetSize();
        int winnings = betSize * 2;
        Main.currency = setCurrency(winnings);

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        printer.congratulations();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        System.out.println("You won $" + winnings + ", so your total currency is now at $" + Main.currency);

    }
    
    public void lose() {
        this.betSize = getBetSize();
        System.out.println("You lost $" + betSize + ", so your total currency is now at $" + Main.currency);
    }
    
    
    
    
    
    public int getBetSize()  { return Main.betSize;}




    public void draw(){

        }

    public int setCurrency(int v) {
        return Main.currency + v;
    }


}

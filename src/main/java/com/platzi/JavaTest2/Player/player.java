package com.platzi.JavaTest2.Player;

public class player {

    public  Dice dice;
    public int myNumberToWin;

    public player(Dice dice, int myNumberToWin) {
        this.dice = dice;
        this.myNumberToWin = myNumberToWin;
    }

    public boolean play()
    {
        int diceSides = dice.rol();
        return diceSides >= myNumberToWin;
    }
}

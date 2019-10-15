package com.spartagloabal.java_basics;

public class Reporting {

    private int moneySpent;
    private int moneyMade;
    private float difference;

    public Reporting(int moneySpent, int moneyMade, float difference) {
        this.moneySpent = moneySpent;
        this.moneyMade = moneyMade;
        this.difference = difference;
    }

    public String report(){
        Integer int1 = moneySpent;
        int1.toString();

        Integer int2 = moneyMade;
        int2.toString();

        Float float1 = difference;
        float1.toString();

        return int1 + " " + int2 + " " + difference;
    }

}

package com.spartagloabal.java_basics;

public class PrimBoxes {
// auto - un boxing
    // Primitive number
    private byte aByte = 127;
    private short aShort = 32767;
    private long aLong = 9223372036854775807L;
    private int anInt = 2147483647;
    private float aFloat = 5418.4455555F;
    private double aDouble = 20.246521552;
    private char aChar = 'a';
    private boolean aBoolean = false;

//    autoboxing (taking the primitive which has no variable and method, and putting it in class
    Byte bByte = aByte;

    public void primeboxes(){
        bByte.toString();
        // aByte to String converted
//        String.valueOf(aByte);
//        Byte newByte = aByte;
//        newByte.toString();
    }

}

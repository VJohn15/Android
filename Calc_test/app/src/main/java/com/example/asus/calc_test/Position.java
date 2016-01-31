package com.example.asus.calc_test;

/**
 * Created by asus on 31.01.2016.
 */
public class Position {
    public Position (){

    }
    public static boolean getPosition (String text, char character) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {

                return true;
            }
        }

        return false;
    }
}

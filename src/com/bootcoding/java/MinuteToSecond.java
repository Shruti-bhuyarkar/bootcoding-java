package com.bootcoding.java;

public class MinuteToSecond {
    public static int convertToSecond(int minutes) {

        return minutes * 60;

    }

    public static void main(String[] args) {
        int minutes =10;
        int seconds = convertToSecond(minutes);
        System.out.println(minutes + "minutes are "+ seconds + "seconds");
    }
}

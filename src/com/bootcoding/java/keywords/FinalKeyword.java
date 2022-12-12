package com.bootcoding.java.keywords;

import oops.Marker;

public class FinalKeyword {
    public static void main(String[] args) {
        /*
        * final keyword is used to create constant variable
        * final variable can not be modified once it is initialized
         */
        final int a=10;
        //a= 20; //re-assign another value
        //a= 30; // changing value of a again
        final double Pie  = 3.14;
        //final keyword to object (reference variable)
        final  Marker blueMarker = new Marker();
        //blueMarker = new Marker();//allowed
        //it is allowed to change the property of oject
        blueMarker.color="Blue";//allowed
        blueMarker.color="Red";//allowed


    }
}

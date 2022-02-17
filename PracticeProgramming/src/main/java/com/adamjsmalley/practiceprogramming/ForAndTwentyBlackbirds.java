/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;


public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        int birdsInPie = 0; // changed this and i to start at 1
        
        for (int i = 1; i <= 24; i++) {
            birdsInPie++;
            System.out.println("Blackbird #" + birdsInPie + " goes into the pie!");
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}

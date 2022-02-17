/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;


public class WaitAWhile {
    public static void main(String[] args) {
        int timeNow = 5;
        int bedTime = 11;
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            //timeNow++;
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}

/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;

import java.util.Random;


public class LazyTeenager {
    public static void main(String[] args) {
        int told = 1;
        int chance = 0;
        Random myRandom = new Random();
        
        do{
            System.out.println("Clean your room!! (x" + told + ")");
            
            chance = 11 - told;
            
            if (myRandom.nextInt(chance) == 1) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                return;
            }
            
            told++;
            
        } while (told != 8);
        
        System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
    }
}

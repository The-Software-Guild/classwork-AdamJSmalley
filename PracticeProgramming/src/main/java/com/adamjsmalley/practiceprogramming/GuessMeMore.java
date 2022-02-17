/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;

import java.util.Random;
import java.util.Scanner;


public class GuessMeMore {
    public static void main(String[] args) {
        Random gen = new Random();
        int num = gen.nextInt(200) - 100;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Your guess: ");
        int guess = myScanner.nextInt();
        
        if(guess > num) {
            System.out.println("Ha, nice try - too High! Try again!");
        }
        else if (guess < num) {
            System.out.println("Ha, nice try - too Low! Try again!");
        }
        else if (guess == num) {
            System.out.println("Wow, nice guess! That was it!");
            return;
        }
        
        System.out.println("Your guess: ");
        guess = myScanner.nextInt();
        
        if(guess > num) {
            System.out.println("Ha, nice try - it was " + num);
        }
        else if (guess < num) {
            System.out.println("Ha, nice try - it was " + num);
        }
        else if (guess == num) {
            System.out.println("Wow, nice guess! That was it!");
        }
    }
}

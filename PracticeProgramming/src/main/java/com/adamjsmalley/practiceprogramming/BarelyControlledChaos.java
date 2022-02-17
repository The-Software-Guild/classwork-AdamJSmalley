/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;

import java.util.Random;


public class BarelyControlledChaos {
    
    public static void main(String[] args) {

        String color = color(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = color(); // call color method again here
        int weight = number(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = number(10, 20); // call number method,
            // with a range between 10 - 20
        int number = number(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = number(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    public static String color () {
        Random num = new Random();
        String color = "";
        
        switch (num.nextInt(5)) {
            case 0:
                color = "Red";  
                break;
            case 1:
                color = "Blue";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Yellow";
                break;
            case 4:
                color = "Pink";
                break;
        }
        
        return color;
    }
    
    public static String animal () {
        Random num = new Random();
        String animal = "";
        
        switch (num.nextInt(5)) {
            case 0:
                animal = "Dog";  
                break;
            case 1:
                animal = "Cat";
                break;
            case 2:
                animal = "Lion";
                break;
            case 3:
                animal = "Wolf";
                break;
            case 4:
                animal = "Shark";
                break;
        }
        
        return animal;
    }
    
    public static int number (int min, int max) {
        Random ran = new Random();
        int x = max - min + 1;
        
        return min + ran.nextInt(x);
    }

}

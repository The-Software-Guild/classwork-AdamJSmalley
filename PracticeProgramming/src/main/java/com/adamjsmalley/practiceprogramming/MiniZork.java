/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/


package com.adamjsmalley.practiceprogramming;

import java.util.Scanner;


public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } else if (action.equals("go to the house")) {
            System.out.println("The house is dark and creepy");
            System.out.println("Explore the house or run away?");
            action = userInput.nextLine();
            
            if(action.equals("Explore")) {
                System.out.println("You got eaten by a ghoast.");
            }
            
            else if (action.equals("Run")) {
                System.out.println("You are on an empty road");
                System.out.println("Lay down or return to the letterbox?");
                action = userInput.nextLine();
                
                if (action.equals("Lay down")) {
                    System.out.println("You get run over"); 
                }
                
                else if (action.equals("Return")) {
                    System.out.println("You are back where you started.");
                }
            }
        }
    }
}

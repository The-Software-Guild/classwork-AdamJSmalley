/**
*@author Adam Smalley
*email: adamjs16@gmail.com
*date: current date
*purpose: My first Hello World program in an IDE
*/

package com.adamjsmalley.pp1_basicspage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare number variables and initialize to 0
        int sum = 0;
        int operand1 = 3;
        int operand2 = 2;
        
        // declare and initialize a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //declare string variables to store console input
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        //wait till the user types in input and store it in operand1
        boolean isValid = false;
        
        do {
            try {
                //ask the user to input the first operand
                System.out.println("Please enter the first number to be added:");
        
                stringOperand1 = myScanner.nextLine();
                operand1 = Integer.parseInt(stringOperand1);
                
                if (operand1 >= 1 && operand1 <=10) {
                    isValid = true;
                }
                
            } catch(NumberFormatException ex) {
                System.out.println("That was not a whole number between 1 and 10!");
            }
            
        } while(!isValid);
        
        
        //ask the user to input the second operand
        System.out.println("Please enter the second number to be added:");
        
        // wait till tr=he user types something and store it in operand2
        stringOperand2 = myScanner.nextLine();
        
        // convert these to strings
        operand2 = Integer.parseInt(stringOperand2);
        
        //assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;
        
        //Note plus (+) is acting as a string concatenation operator instead of an addition operator.
        System.out.println("Sum is: " + sum);
    }
}

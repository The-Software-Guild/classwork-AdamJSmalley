/**
 *@author Adam Smalley
 *email: adamjs16@gmail.com
 *date: current date
 *purpose: My first Hello World program in an IDE
 */
package com.adamjsmalley.windowmaster;

import java.text.NumberFormat;
import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        //declare variables for cost, height and width
        float height;
        float width;
        float costOfWindow;
        float costOfTrim;
        float numberOfWindows;

        //daclare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        //declare and initialize Scanner
        Scanner myScanner = new Scanner(System.in);

        //get input from the user
        width = getNumber("Please enter window width", myScanner);
        height = getNumber("Please enter window height", myScanner);
        costOfWindow = getNumber("Please enter the cost of windows", myScanner);
        costOfTrim = getNumber("Please enter the cost of Trim", myScanner);
        numberOfWindows = getNumber("Please enter the number of windows", myScanner);

        //calculate the area of the window
        areaOfWindow = height * width;

        //calculate the perimeter of the window
        perimeterOfWindow = 2 * (width + height);

        //calculate the cost
        cost = ((costOfWindow * areaOfWindow) + (costOfTrim * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height: " + height);
        System.out.println("Window width: " + width);
        System.out.println("Window area: " + areaOfWindow);
        System.out.println("Window perimeter: " + perimeterOfWindow);
        System.out.println("Cost of one window: " + cost);
        System.out.println("Total Cost = " + (numberOfWindows * cost));

    }

    private static float getNumber(String message, Scanner scanner) {

        float number = 0;
        
        do {
            try {

                System.out.println(message);
                number = Float.parseFloat(scanner.nextLine());

            } catch (NumberFormatException ex) {
                System.out.println("You didn't enter a number");
            }
        } while (number == 0);
        
        return number;
    }
}

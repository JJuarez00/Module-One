// Week: 1
//   Chapter: 2
//      Exercise 2.3

// Task: CONVERT FEET INTO METERS
// Descrition: Write a program that reads a number in feet, 
//             converts it to meters, and displays the result.
//             {1 foot} is {0.305 meter}

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        // Added "try" since I kept on getting "Resource Leak"
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a value for feet: ");
            double feet = input.nextDouble();

            double meter = .305;

            double answer = meter * feet;

            System.out.println(feet + " feet is " + answer + " meters.");
        }

    }
}


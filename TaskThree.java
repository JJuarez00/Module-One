// Week: 1
//   Chapter: 3
//      Exercise 3.15

// Task: "GAME: LOTTERY"
// Descrition: 
//              1. If the user input matches the lottery number in the exact order, the award is $10,000.
//              2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
//              3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter a three-digit number (psst make sure its greater than 99 + ): ");
// -  - This gets the user input
                int userGuess = input.nextInt();

// -  - Checks if user input is 3 digits
                while ( userGuess < 100 || userGuess > 999) {
                    int guess;
                    System.out.print("Invalid Try Again: ");
// -  - This gets the user input
                    guess = input.nextInt();
                    userGuess = guess;
                }

                System.out.println("Your guess: " + userGuess);


// -  - Generate a random 3-digit number
                int randomNumber = (int) (Math.random() * 900 + 100);

                System.out.println("Random 3-Digit Number: " + randomNumber + "\n");


// -  - Seperates the user guess so it can be used in the lottery
                int guessOne = userGuess / 100;
                System.out.println(guessOne); //     - - - - - - - > shows the user digit
                
                int guessTwo = (userGuess % 100) / 10;
                System.out.println(guessTwo); //    - - - - - - - > shows the user digit

                int guessThree = userGuess % 10;
                System.out.println(guessThree); //    - - - - - - - > shows the user digit


// -  - Seperates the user guess so it can be used in the lottery
                int randOne = randomNumber / 100;
                int randTwo = (randomNumber % 100) / 10;
                int randThree = randomNumber % 10;


// -  - If the user input matches the lottery number in the exact order, the award is $10,000
                if (userGuess == randomNumber) {
                    System.out.println("\nIt's a match! You just won $10,000!");
                }

// -  - If all digits in the user input match all digits in the lottery number, the award is $3,000.
                else if ((guessOne == randOne || guessOne == randTwo || guessOne == randThree) &&
                           (guessTwo == randOne || guessTwo == randTwo || guessTwo == randThree) &&
                           (guessThree == randOne || guessThree == randTwo || guessThree == randThree)) {
                    System.out.println("\n Not an exact macth but you had all the digits, so you just won $3,000!");
                }

// -  - If one digit in the user input matches a digit in the lottery number, the award is $1,000.
                else if (guessOne == randOne || guessTwo == randTwo || guessThree == randThree ||
                           guessOne == randTwo || guessOne == randThree ||
                           guessTwo == randOne || guessTwo == randThree ||
                           guessThree == randOne || guessThree == randTwo) {
                    System.out.println("\nOne digit matched with the random number. You just won $1,000!");
                } 

                else {
                    System.out.println("\nSorry, no match");
                }
        }

        String endStr = " - ";
        System.out.println("\n" + endStr.repeat(18) + "\n");
    }
}


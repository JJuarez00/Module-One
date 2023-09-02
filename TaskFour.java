// Week: 1
//   Chapter: 4
//      Exercise 4.23

// Task: "FINANCIAL APPLICATION: PAYROLL"
// Description: Write a program that reads the following information and prints a payroll statement
//              Instruction on page 156

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // INPUTS
// -  - User enters name        
            System.out.print("\nEnter Employee's name:  ");
            String employeeName = input.nextLine();

// -  - User enters hours worked in a week
            System.out.print("Enter # of Hours Worked this week:  ");
            Double hoursWorked = input.nextDouble();

// -  - User enters pay rate
            System.out.print("Enter Hourly Pay Rate:  ");
            Double payRate = input.nextDouble();

            //  TAX 
// -  - The Federal Tax
            Double fedTax = .20;

// -  - The State tax
            Double stateTax = .09;

            // MATH
// -  - The Math for Hours Worked and Hourly Pay
            Double grossPay = hoursWorked * payRate;

// -  - The math for Federal and State Tax
            Double fedDeduct = grossPay * fedTax;
            Double stateDeduct = grossPay * stateTax;

// -  - The Math for The Net Pay
            Double netPay = grossPay - (grossPay * (fedTax + stateTax));

// -  - Final Result
            System.out.println("\n\n Employee Name: " + employeeName
                            +    "\n Hours Worked: " + hoursWorked
                            +    "\n Pay Rate: " + payRate);
            System.out.printf(" Net Pay: %.2f", grossPay);
            System.out.print("\n\n DEDUCTIONS: ");
            System.out.printf("\n Federal Withholding: %.2f", fedDeduct);
            System.out.printf("\n State Withholding: %.2f", stateDeduct);
            System.out.printf("\n Net Pay: %.2f\n", netPay);
        }
    }
}

// Week: 1
//   Chapter: 5
//      Exercise 5.5

// Task: CONVERSION FROM KILOGRAMS TO POUNDS AND POUNDS TO KILOGRAMS
// Description: Write a program that displays the following two tables side by side
//              Image on page 195
public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Kilograms   |   Pounds   |   |   Pounds   |   Kilograms");
        System.out.println("----------------------------------------------");


        // How I Got These Numbers:
        // kilograms goes from 1 to 3, which adds up by [2] and repeats
        // pounds in chart one goes from 2.2 to 6.6, which adds up by [4.4] and repeats
        // pounds in chart two goes from 20 to 25, which adds up by [5] and repeats
        // kilograms in chart two goes from 9.09 to 11.36, which adds up every [2.7] and repeats
        // also kilograms on chart one end off with 197 so thats the end.
        
        for (double kilo = 1, poundsChartOne = 2.2, poundsChartTwo = 20, kilograms = 9.09; kilo <= 199; kilo += 2, poundsChartOne += 4.4, poundsChartTwo += 5, kilograms += 2.27) {
            System.out.printf("%.0f      |   %.1f        |   |   %.0f        |   %.2f%n", kilo, poundsChartOne, poundsChartTwo, kilograms);
        }
    }
}


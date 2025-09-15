/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times to run the program: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            //Scanner scannerObj = new Scanner(System.in);

            System.out.print("Input three Numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();
            double avgNums = (num1 + num2 + num3) / 3;
            double sumNums = num1 + num2 + num3;
            double prodNums = num1 * num2 * num3;

            System.out.println("Sum: " + sumNums);
            System.out.println("Product: " + prodNums);
            System.out.println("Average: " + avgNums);
        }
    }
}


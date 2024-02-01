package algorithmProblems.CodingChallenge;

import java.util.Scanner;

public class ImplOperations {
    public static void implOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}

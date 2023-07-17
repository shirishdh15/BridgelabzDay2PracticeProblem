package Day2PracticeProblems;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();

        // Performing arithmetic operations
        double result1 = a + (b * c);
        double result2 = c + (a / b);
        double result3 = (a % b) + c;
        double result4 = (a * b) + c;

        // Finding the maximum and minimum
        double max = Math.max(result1, Math.max(result2, Math.max(result3, result4)));
        double min = Math.min(result1, Math.min(result2, Math.min(result3, result4)));

        // Printing the results
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
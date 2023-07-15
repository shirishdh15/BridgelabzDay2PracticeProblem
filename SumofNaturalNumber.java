package Day2PracticeProblems;
import java.util.Scanner;
public class SumofNaturalNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of the first " + n + " natural numbers: " + sum);
        }
    }
package Day2PracticeProblems;
import java.util.Scanner;
public class NaturalNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum of the first " + n + " natural numbers: " + sum);
        }
    }
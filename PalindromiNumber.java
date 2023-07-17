package Day2PracticeProblems;
import java.util.Scanner;
public class PalindromiNumber {
        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;
            // Reversing the number
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = (reversedNumber * 10) + digit;
                number = number / 10;
            }
            if (originalNumber == reversedNumber) {
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            if (isPalindrome(n)) {
                System.out.println(n + " is a palindrome number.");
            } else {
                System.out.println(n + " is not a palindrome number.");
            }
        }
}
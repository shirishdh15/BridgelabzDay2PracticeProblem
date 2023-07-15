package Day2PracticeProblems;
import java.util.Scanner;
public class ReadNumberDisplay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1, 10, 100, or 1000): ");
            int number = scanner.nextInt();
            int unit = number % 10;
            int ten = (number / 10) % 10;
            int hundred = (number / 100) % 10;
            if (number == 1 || number == 10 || number == 100 || number == 1000) {
                System.out.println("Unit: " + unit);
                System.out.println("Ten: " + ten);
                System.out.println("Hundred: " + hundred);
            } else {
                System.out.println("Invalid input. Please enter 1, 10, 100, or 1000.");
            }
        }
    }
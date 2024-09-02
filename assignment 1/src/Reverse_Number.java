import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int revNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;
            revNumber = revNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + revNumber);
    }
}
import java.util.Scanner;

public class skipNegative{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number (enter 0 to exit): ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number < 0) {
                    continue;
                }
                sum += number;
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        System.out.println("The sum of positive numbers is: " + sum);
    }
}

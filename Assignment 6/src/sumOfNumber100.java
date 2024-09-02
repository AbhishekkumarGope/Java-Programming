import java.util.Scanner;
public class sumOfNumber100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number to add to the sum:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                sum += number;

                if (sum >= 100) {
                    break;
                }
            } else {
                System.out.println("Entered Character is not a Number. Exiting...");
                break;
            }
        }

        // Display the final sum
        System.out.println("The final sum is: " + sum);
    }
}

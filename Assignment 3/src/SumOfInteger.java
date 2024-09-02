import java.util.Scanner;
public class SumOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive integers to sum. Enter 0 to stop.");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("Only positive integers are added to the sum.");
            }
        }
        System.out.println("The sum of positive integers entered is: " + sum);
    }
}

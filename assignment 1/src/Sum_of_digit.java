import java.util.Scanner;
public class Sum_of_digit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum = sum+digit;
            tempNumber = tempNumber/10;
        }
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}

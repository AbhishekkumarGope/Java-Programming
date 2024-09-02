import java.util.Scanner;

public class convert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        int integerNumber = (int) decimalNumber;

        System.out.println("The integer value is: " + integerNumber);
    }
}

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
    }
}

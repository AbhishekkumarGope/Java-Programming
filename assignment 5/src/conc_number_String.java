import java.util.Scanner;

public class conc_number_String{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();

        String concatenatedResult = firstNumber + secondNumber;

        System.out.println("Concatenated result: " + concatenatedResult);
    }
}

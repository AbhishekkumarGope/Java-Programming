import java.util.Scanner;

public class checkNumberGreater100 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isGreaterThan100 = number > 100;

        if (isGreaterThan100) {
            System.out.println("The number " + number + " is greater than 100.");
        } else {
            System.out.println("The number " + number + " is not greater than 100.");
        }
    }
}

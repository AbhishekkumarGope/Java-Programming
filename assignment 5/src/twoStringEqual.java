import java.util.Scanner;

public class twoStringEqual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean areEqual = firstString.equals(secondString);

        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}

import java.util.Scanner;

public class multi_address {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the street: ");
        String street = scanner.nextLine();

        System.out.println("Enter the city: ");
        String city = scanner.nextLine();

        System.out.println("Enter the pin code: ");
        String zipCode = scanner.nextLine();

        String multiAddress = street + "\n" + city + ", " + zipCode;

        System.out.println("\nFormatted Address:\n" + multiAddress);
    }
}

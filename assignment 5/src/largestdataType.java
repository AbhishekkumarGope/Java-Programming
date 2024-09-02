import java.util.Scanner;

public class largestdataType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a large integer value (long): ");
        long largeNumber = scanner.nextLong();

        byte smallNumber = (byte) largeNumber;

        System.out.println("The byte value is: " + smallNumber);
    }
}

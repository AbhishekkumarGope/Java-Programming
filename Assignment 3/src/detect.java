import java.util.HashSet;
import java.util.Scanner;

public class detect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numbersSet = new HashSet<>();
        System.out.println("Enter numbers. The program will stop when you enter a duplicate number.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (numbersSet.contains(number)) {
                System.out.println("Duplicate number detected: " + number);
                break;
            } else {
                numbersSet.add(number);
            }
        }
    }
}

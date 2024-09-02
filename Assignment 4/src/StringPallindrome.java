import java.util.Scanner;
public class StringPallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(normalized).reverse().toString();
        if (normalized.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

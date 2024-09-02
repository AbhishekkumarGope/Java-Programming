import java.util.Scanner;
public class expectVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                    currentChar == 'o' || currentChar == 'u') {
                continue;
            }

            System.out.print(currentChar);
        }
        System.out.println();
    }
}

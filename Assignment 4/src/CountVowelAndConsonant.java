import java.util.Scanner;

public class CountVowelAndConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

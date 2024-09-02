import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (charFrequencyMap.containsKey(ch)) {
                charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            } else {
                charFrequencyMap.put(ch, 1);
            }
        }
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

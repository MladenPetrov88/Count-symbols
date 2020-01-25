import java.util.*;

public class CountSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> chars = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!chars.containsKey(currentChar)) {
                chars.put(currentChar, 1);
            } else {
                chars.put(currentChar, chars.get(currentChar) + 1);
            }

        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : chars.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + ":" + " " + characterIntegerEntry.getValue() + " time/s");
        }

    }
}

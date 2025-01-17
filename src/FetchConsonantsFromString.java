import java.util.Scanner;

public class FetchConsonantsFromString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Consonants in the string: " + getConsonants(input));
    }

    public static String getConsonants(String str) {
        StringBuilder consonants = new StringBuilder();

        // Convert the string to lowercase to handle case insensitivity
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Check if the character is a consonant (not a vowel, digit, or special character)
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                consonants.append(ch);
            }
        }
        return consonants.toString();
    }
}



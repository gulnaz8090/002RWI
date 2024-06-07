import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // Using LinkedHashSet to maintain the order of characters
        Set<Character> charSet = new LinkedHashSet<>();

        // Loop through the string and add each character to the set
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        // Build the result string from the set
        StringBuilder sb = new StringBuilder();
        for (char c : charSet) {
            sb.append(c);
        }

        // Return the result string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example string
        String str = "programming";

        // Call the removeDuplicates method
        String result = removeDuplicates(str);

        // Output the result
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}

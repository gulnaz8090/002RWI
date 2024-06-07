import java.util.Arrays;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any whitespace and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Example strings
        String str1 = "Listen";
        String str2 = "Silent";

        // Call the areAnagrams method
        boolean result = areAnagrams(str1, str2);

        // Output the result
        if (result) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}

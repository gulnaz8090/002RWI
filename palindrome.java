public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Loop through the string
        while (start < end) {
            // If characters at start and end are not the same, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            // Move the pointers closer to the center
            start++;
            end--;
        }

        // If all characters matched, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example string
        String str = "Madam";

        // Call the isPalindrome method
        boolean result = isPalindrome(str);

        // Output the result
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}

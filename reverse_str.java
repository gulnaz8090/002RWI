public class StringReverser {
    // Method to reverse a string
    public static String reverseString(String str) {
        // Create a StringBuilder from the string
        StringBuilder sb = new StringBuilder(str);

        // Use the reverse method of StringBuilder
        sb.reverse();

        // Convert StringBuilder back to a string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example string
        String originalString = "example string";

        // Call the reverseString method
        String reversedString = reverseString(originalString);

        // Output the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}

public class FirstNonRepeatedCharacter {

    
    public static Character findFirstNonRepeatedChar(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the first occurrence of the character is the same as the last occurrence
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        // Return null if no non-repeated character is found
        return null;
    }

    public static void main(String[] args) {
        // Example string
        String str = "swiss";

        // Call the findFirstNonRepeatedChar method
        Character result = findFirstNonRepeatedChar(str);

        // Output the result
        if (result != null) {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

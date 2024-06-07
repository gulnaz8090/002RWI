public class CharacterCounter {

    // Method to count lowercase and uppercase characters and remove lowercase characters
    public static String processString(String str) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        StringBuilder result = new StringBuilder();

        // Loop through the string and count characters
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
                result.append(c); // Append uppercase character to result
            } else {
                result.append(c); // Append non-alphabet characters to result
            }
        }

        // Output the counts
        System.out.println("Number of lowercase characters: " + lowercaseCount);
        System.out.println("Number of uppercase characters: " + uppercaseCount);

        // Return the resulting string with lowercase characters removed
        return result.toString();
    }

    public static void main(String[] args) {
        // Example string
        String str = "Example String with UPPER and lower CASE letters.";

        // Call the processString method
        String processedString = processString(str);

        // Output the processed string
        System.out.println("String after removing lowercase characters: " + processedString);
    }
}

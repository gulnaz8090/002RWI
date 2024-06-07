public class VowelCounter {

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Initialize a count variable
        int count = 0;

        // Loop through the string and check each character
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        // Return the total count of vowels
        return count;
    }

    public static void main(String[] args) {
        // Example string
        String str = "Example String";

        // Call the countVowels method
        int vowelCount = countVowels(str);

        // Output the result
        System.out.println("The number of vowels in the string \"" + str + "\" is: " + vowelCount);
    }
}

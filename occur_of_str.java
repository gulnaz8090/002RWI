public class CharacterCount {
    public static void main(String[] args) {
        String str = "example string";
        char ch = 'e';
        int count = 0;

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Iterate through the char array and count occurrences of the character
        for (char c : charArray) {
            if (c == ch) {
                count++;
            }
        }

        // Output the result
        System.out.println("The character '" + ch + "' appears " + count + " times in the string \"" + str + "\".");
    }
}

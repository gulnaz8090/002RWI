public class FindMaxMin {

    // Function to find the maximum value in the array
    public static int findMax(int[] array) {
        int max = array[0];  // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Update max if current element is greater
            }
        }
        return max;
    }

    // Function to find the minimum value in the array
    public static int findMin(int[] array) {
        int min = array[0];  // Assume the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Update min if current element is smaller
            }
        }
        return min;
    }

    // Main method to test the findMax and findMin functions
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}

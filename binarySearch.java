public class BinarySearch {

    // Function to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[middle] == target) {
                return middle;  // Target found
            }

            // If target greater, ignore left half
            if (array[middle] < target) {
                left = middle + 1;
            } else {
                // If target is smaller, ignore right half
                right = middle - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

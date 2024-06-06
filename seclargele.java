public class SecondLargest {

    // Function to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;  // Return minimum value if array has less than 2 elements
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};

        int secondLargest = findSecondLargest(array);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Array doesn't have a second largest element");
        } else {
            System.out.println("The second largest element is " + secondLargest);
        }
    }
}

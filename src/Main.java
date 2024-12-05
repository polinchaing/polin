import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int removeIndex = 2; // Index to remove

        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Shift elements to the left
        }// Replace last element with 0

        System.out.println(Arrays.toString(array)); // Output: [1, 2, 4, 5, 0]
    }
}

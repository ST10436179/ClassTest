import java.util.Arrays;

public class Question3 {

    public static void main(String[] args) {
        // Declare and initialize an array with given values
    int[] array = {10 ,5, 20 ,25, 29, 27, 22, 12, 8};
    int size = array.length;


        for (int i = 0; i < size -1; i++) {
            for (int j = 0; j < size - 1; j++) {
                // Check if values are greater than
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Output values
        System.out.println(Arrays.toString(array));
    }
}

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {20 ,5 ,15 ,10 ,3 ,17 ,7};

        int size = array.length;

        int a = 1;

        while(a < size){
            int b = a - 1;
            int temp = array[a];

            while(b >= 0 && array[b] > temp){
                array[b + 1] = array[b];
                b--;
            }
            array[b + 1] = temp;
            a++;
        }
        // Output  The Array
        System.out.println(Arrays.toString(array));
    }
}

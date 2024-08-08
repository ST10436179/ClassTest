//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declare and instantiate on a single line a one-dimensional array called strArr that
        //holds 50 Strings.
        String[] strArr = new String[50];
        //Declare on one line and instantiate on a second line a one-dimensional array called
        //strArr that holds 50 Strings

        // iii)Initialize every position in strArr to a backslash. Do not hardcode the length of the array in any way
        int size = strArr.length;
        for (int i = 0; i < size; i++) {
            strArr[i] = "/";
        }
        //iv. Starting at the end of strArr and working back toward the beginning, display each index and the element stored at that index,
        // separated by a colon (:). Each entry
        //should be displayed on a separate line. Do not hardcode the length of the array in any way.

        for(int i = strArr.length - 1; i <= 0 ; i--) {
            System.out.println("Index is: "+ i + " And element value is: "+ strArr[i]);

        }



        }
    }

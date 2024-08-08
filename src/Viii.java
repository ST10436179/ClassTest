public class Viii {

    public static void main(String[] args) {
        // Declare the two array
        int[][] intArr;

        intArr = new int[5][];

        // Initialize row with 8 columns
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = new int[8];
        }

        // Multiply the columns with the row
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = i * j;
            }
        }

        // Print each row with sum
        for (int i = 0; i < intArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + " ");
                sum += intArr[i][j];
            }
            System.out.println(":" + sum);
        }


    }
}

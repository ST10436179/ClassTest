import java.util.Random;


public class Randoms {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] intArr = new int [50];
        for (int i = 0; i < intArr.length ; i ++){
            intArr[i] = rand.nextInt(50) ;
    }

        for(int i =0; i<intArr.length - 1; i++){
            for (int j = 0; j < intArr.length - 1; j++) {
                if(intArr[j] < intArr[j+1]){
                    int temp = intArr[j];
                    intArr[j+1] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

    }

}

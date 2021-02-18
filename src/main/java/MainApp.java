import java.util.Arrays;

public class MainApp {
    public int [] arr;

    public MainApp(int[] arr) {
        this.arr = arr;
    }



    public int[] newArrBeforeFour(int [] arr){
        int [] newArr = new int[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

                if (arr[i] == 4) {
                    count++;

                   newArr = new int[arr.length-(i+1)];

                    for (int j = i+1, k = 0; j < arr.length ; j++, k++) {

                      newArr[k] = arr[j];
                   }
                }
            }
        if (count == 0) {
            throw new RuntimeException();
        }

        return newArr;
    }

    public boolean oneAndFourToArray (int [] arr){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
             count1++;
            }
            if (arr[i] == 4){
                count2++;
            }
        }
     if (count1 + count2 == arr.length && count1 != arr.length && count2 != arr.length){
         return true;
     }
        return false;
    }
}

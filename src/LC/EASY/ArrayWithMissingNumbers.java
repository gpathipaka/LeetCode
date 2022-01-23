package LC.EASY;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithMissingNumbers {


    public static void main(String[] args) {
        int[] arr = {1,2,6,1,1,2};
        System.out.println(findMissingNumbers(arr).toString()); //[3, 4, 5]
    }

    private static List<Integer> findMissingNumbers(int[] arr) {
        int size = arr.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<size; i++) {
            int number = Math.abs(arr[i]);
            arr[number-1] = -1 * number;
        }
        for(int i=0; i < size; i++) {
            if(arr[i] > 0)
                lst.add(i+1);
        }
        return lst;
    }
}

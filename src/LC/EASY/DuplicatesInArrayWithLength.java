package LC.EASY;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayWithLength {

    private static boolean checkDuplicates(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }
            if(i >= k) {
                System.out.println("Do This....");
                set.remove(arr[i-k]);
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,7};

        if(checkDuplicates(arr, 4)) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}

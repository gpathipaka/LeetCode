package LC101;

import java.util.*;
import java.util.stream.*;

public class DuplicatesInArray {

    private static boolean checkDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            if(set.contains(arr[i]))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

    private static boolean checkDuplicatesUsingStreams(int[] arr) {
        return Arrays
                .stream(arr)
                .boxed()
                .distinct()
                .count() == arr.length;

    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 5};
        if(!checkDuplicatesUsingStreams(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

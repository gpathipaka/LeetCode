package LC.EASY;

import java.util.HashSet;
import java.util.Set;

public class RepeatingItemsInArray {

    private static void printRepeatingItems() {
        int[] arr = new int[]{500, 700, 500, 600, 700};
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                System.out.println("Duplicate Item " + arr[i]);
            } else {
                set.add(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        printRepeatingItems();
    }
}

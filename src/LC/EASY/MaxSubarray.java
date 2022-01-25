package LC.EASY;

import java.util.Arrays;

public class MaxSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = sumOfMaxSubarray(arr);
        System.out.println("Max Sum=" + sum);
    }

    private static int sumOfMaxSubarray(int[] arr) {
        //if all negative values
       int sum = Arrays.stream(arr).max().getAsInt();
       if (sum < 0) {
           return sum;
       }
       int maxSum = 0, tempSum = 0;
       for(int num : arr) {
           tempSum += num;
           tempSum = Integer.max(tempSum, 0);
           maxSum = Integer.max(maxSum, tempSum);
       }
       return maxSum;
    }
    //     -2, 1, -3, 4, -1, 2, 1, -5, 4
    // temp 0  1   0  4   3  5  6   1  5
    //sum   0  1   1  4   4  5  6   6  6
}

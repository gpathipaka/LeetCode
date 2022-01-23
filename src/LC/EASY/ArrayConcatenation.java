package LC.EASY;

public class ArrayConcatenation {

    private static int[] arrConcateNation(int[] arr) {
        int size = arr.length;
        int[] answer = new int[ 2*size ];
        for (int i=0; i< size; i++) {
            answer[i + size] = answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        System.out.println("Array Concatenation " + arrConcateNation(arr));
    }
}

package LC101;

public class ArraySortedAndRotated {

    public boolean check(int[] arr) {
        boolean rotated = false;
        for(int i=0; i<arr.length -1; i++) {
            if(arr[i] > arr[i+1]) {
                if(rotated) {
                    return false;
                }
                rotated = true;
            }
        }
        if (rotated && arr[arr.length-1] > arr[0]) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArraySortedAndRotated arraySortedAndRotated = new ArraySortedAndRotated();
        int[] arr = { 3, 4, 5, 6, 1, 2 };
        if(arraySortedAndRotated.check(arr)) {
            System.out.println("Array Sorted and Roted");
        } else {
            System.out.println("************");
        }
    }
}

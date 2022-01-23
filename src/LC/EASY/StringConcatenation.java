package LC.EASY;

public class StringConcatenation {

    public static void main(String[] args) {
        stringConcatenation("Gangadhar");
    }

    private static void stringConcatenation(String str) {
        char[] arr = new char[str.length() * 2];
        for(int i=0; i<str.length(); i++) {
            arr[i + str.length()] = arr[i] = str.charAt(i);
        }
        System.out.println(String.valueOf(arr));
        str.concat("GP");
    }
}

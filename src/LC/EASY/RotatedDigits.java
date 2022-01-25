package LC.EASY;

public class RotatedDigits {

    public static void main(String[] args) {
        int goodNumbers = rotatedDigits(15);
        System.out.println("Good Numbers " + goodNumbers);
    }

    private static int rotatedDigits(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if(isRotates(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isRotates(String num) {
        StringBuilder sb = new StringBuilder();
        for (char ch : num.toCharArray()) {
            if (ch == '0' || ch == '1' || ch == '8') {
                sb.append(ch);
            } else if (ch == '2' || ch == '5') {
                sb.append(ch == '2' ? '5' : '2');
            } else if(ch == '6' || ch == '9') {
                sb.append(ch == '6' ? '9' : '6');
            } else {
                return false;
            }
        }
        return !sb.toString().equals(num);
    }
}

package LC.EASY;

public class SumOf2Integers {
    public static void main(String[] args) {
        int sum = sum(5,7);
        System.out.println("Sum = " + sum);
    }

    private static int sum(int a, int b) {

        // do it until b is 0
        while (b != 0) {
            //find common set bits
            int carry = a & b;
            //XOR gives sum of a and b
            a = a ^ b;
            //shift bits left by 1
            b = carry << 1;
            System.out.println("b =" +b);
        }
        return a;
    }
}

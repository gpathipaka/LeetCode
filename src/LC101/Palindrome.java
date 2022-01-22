package LC101;

public class Palindrome {

    public boolean isPalindrome(int number) {
        int divisor = 1;
        while(number / divisor >= 10)
            divisor *= 10;
        while (number != 0) {
            int leading = number / divisor;
            int trailing = number % 10;
            if(leading != trailing) {
                return false;
            }
            // Removing the leading and trailing
            number = (number % divisor) / 10;
            // Reducing divisor by a factor
            // of 2 as 2 digits are dropped
            divisor = divisor / 100;
        }
        return true;
    }

    public boolean isPalindrome(String str) {
        if(str == null || str.length() == 1)
            return true;
        int i=0, j=str.length() -1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int number = 1221;
        //boolean isPolindrome = palindrome.isPalindrome(number);
        boolean isPolindrome = palindrome.isPalindrome("GPGXYG");
        if(isPolindrome)
            System.out.println("Number " + number + " is Polindrome");
        else
            System.out.println("Number " + number + " is Not a Polindrome");
    }
}

package LC.EASY;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class CapitalizeTheTitle {


    public static void main(String[] args) {
        System.out.println(capitalizeTitle("gangadhar pathipaka"));
    }

    private static String capitalizeTitle(String title) {
        return Arrays.stream(title.split("\\s+"))
                .map(s -> s.length() < 2 ? s.toUpperCase() : s.substring(0,1).toUpperCase(Locale.ROOT) + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}

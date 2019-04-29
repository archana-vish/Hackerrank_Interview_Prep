package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatSubstring {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        if (n == 0) {
            return -1L;
        } else if (n == 1) {
            return 1L;
        } else if (s.length() == 1 && s.equals("a")) {
            return n;
        }
        long frequencyOfAinString = Arrays.stream(s.split("")).filter(l -> l.equals("a")).count();


        long fineSplit = n/s.length();
        long finite = (frequencyOfAinString * fineSplit);
        System.out.println("finite.." + finite);


        long remainder = n%s.length();
        System.out.println(remainder);
        String sub = s.substring(0, (int) remainder);
        long f2 = Arrays.stream(sub.split("")).filter(l -> l.equals("a")).count();
        System.out.println(f2);

        return finite + f2;


//        int originalLength = s.length();
//
//        frequency = (long) Math.ceil((1f * n * frequencyOfAinString )/ originalLength);
//
//        return frequency;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         String s = "gfcaaaecbg";

        long n = 547602L;

        //long n = 12;

//        String s = "aab";
//
//        long n = 11;

        long result = repeatedString(s, n);

        System.out.println(result);

    }
}
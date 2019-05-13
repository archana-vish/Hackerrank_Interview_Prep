package BlackRock;

/**
 * Write a short program that prints each number from 1 to 100 on a new line.
 For each multiple of 3, print "Fizz" instead of the number.
 For each multiple of 5, print "Buzz" instead of the number.
 For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 */

public class Solution {


    public static String getFizzOrBuzz(int i) {
        return  (i%15==0)? "FizzBuzz"
                :(i%3==0)? "Fizz"
                :(i%5==0)?"Buzz":Integer.toString(i);
    }

    public static int runNTimes(int n) {

        int counter = 0;

        for (int i = 1; i<= n; i++) {
            getFizzOrBuzz(i);
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {

        runNTimes(100);

    }
}

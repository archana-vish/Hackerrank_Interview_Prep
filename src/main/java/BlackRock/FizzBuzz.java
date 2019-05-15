package BlackRock;

public class FizzBuzz {

    public static String getFizz() {
        return "Fizz";
    }

    public static String getBuzz() {
        return "Buzz";
    }

    public static String getFizzBuzz() {
        return "FizzBuzz";
    }

    public static String getFizzBuzzOrBoth(int n) {
        return (n%15 == 0) ? getFizzBuzz()
                           : (n%3 == 0) ? getFizz() : (n%5 == 0) ? getBuzz() :  Integer.toString(n);
    }



    public static int printFizzBuzz(int n) {

        int counter = 0;

        for (int i=1; i <= n; i++) {
//            if (i%15 == 0 ) {
//                System.out.println(getFizzBuzz());
//            } else if (i%3 == 0) {
//                System.out.println(getFizz());
//            } else if(i%5 == 0) {
//                System.out.println(getBuzz());
//            } else {
//                System.out.println(i);
//            }
            System.out.println(getFizzBuzzOrBoth(n));
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        FizzBuzz.printFizzBuzz(100);
    }
}

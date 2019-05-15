package BlackRock;

public class FizzBuzzElegant {


    public boolean isDivisible(int num, int divisor) {
        return (num%divisor == 0);
    }

    public String getFizzOrBuzzOrBoth(int number) {
        return isDivisible(number, 3)
                ? isDivisible(number, 5) ? "FizzBuzz" : "Fizz"
                : isDivisible(number, 5) ? "Buzz" : Integer.toString(number);
    }

    public int printFizzBuzz(int size) {
        int counter;

        for (counter = 1; counter <= size; counter++) {
            testSystemOut(getFizzOrBuzzOrBoth(counter));
        }

        return --counter;
    }

    public String testSystemOut(String value) {
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        FizzBuzzElegant fizzBuzzElegant = new FizzBuzzElegant();
        fizzBuzzElegant.printFizzBuzz(100);

    }
}

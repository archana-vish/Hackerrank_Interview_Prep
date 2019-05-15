package BlackRock;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void when_3_print_fizz() {
        assertEquals("Fizz",FizzBuzz.getFizzBuzzOrBoth(3));
    }

    @Test
    public void when_5_print_buzz() {
        assertEquals("Buzz", FizzBuzz.getFizzBuzzOrBoth(5));
    }

    @Test
    public void when_3_or_5_print_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzzOrBoth(15));
    }

    @Test
    public void when_not_3_or_not_5_print_number() {
        assertEquals("7", FizzBuzz.getFizzBuzzOrBoth(7));
    }


}
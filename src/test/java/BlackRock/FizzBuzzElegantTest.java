package BlackRock;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzElegantTest {


    FizzBuzzElegant fizzBuzzElegant = new FizzBuzzElegant();

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
       System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void getFizz() {
        assertEquals("Fizz", fizzBuzzElegant.getFizzOrBuzzOrBoth(3));

    }

    @Test
    public void getBuzz() {

        assertEquals("Buzz", fizzBuzzElegant.getFizzOrBuzzOrBoth(5));
    }

    @Test
    public void getFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzElegant.getFizzOrBuzzOrBoth(15));
    }

    @Test
    public void testSystemOut() {
        System.out
        assertEquals("Fizz", fizzBuzzElegant.testSystemOut("Fizz"));
    }

    @Test
    public void testLoopCount() {
        assertEquals(100, fizzBuzzElegant.printFizzBuzz(100));

    }

}

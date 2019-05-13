package BlackRock;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void check_for_five_prints_Buzz() {
        assertEquals(Solution.getFizzOrBuzz(5),"Buzz");
    }

    @Test
    public void check_for_five_prints_Fizz() {
        assertEquals(Solution.getFizzOrBuzz(3),"Fizz");
    }

    @Test
    public void check_for_three_and_five_prints_FizzBuzz() {
        assertEquals(Solution.getFizzOrBuzz(15),"FizzBuzz");
    }

    @Test
    public void check_for_not_3_or_5_prints_number() {
        assertEquals(Solution.getFizzOrBuzz(2),Integer.toString(2));
    }

    @Test
    public void test_loop_runs_n_times() {
        assertEquals(Solution.runNTimes(100), 100);
    }

}
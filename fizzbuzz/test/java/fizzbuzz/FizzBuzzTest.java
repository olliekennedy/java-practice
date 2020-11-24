package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void list() {
        assertEquals(100, FizzBuzz.list().length);
        assertEquals(1, FizzBuzz.list()[0]);
        assertEquals("FizzBuzz", FizzBuzz.list()[14]);
        assertEquals("Fizz", FizzBuzz.list()[2]);
        assertEquals("Buzz", FizzBuzz.list()[4]);
        assertEquals(98, FizzBuzz.list()[97]);
    }
}
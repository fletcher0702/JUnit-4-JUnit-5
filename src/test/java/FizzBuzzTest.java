import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

public class FizzBuzzTest {

    @BeforeAll
    public static void testPrint() {
        System.out.println("Yo Before all ! ");
    }

    @Test
    public void should_be_fizz_when_divided_by_3() {

        int candidate = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = fizzBuzz.fizzBuzz(candidate);
        String FIZZ = "Fizz";

        Assertions.assertSame(expected, FIZZ);

    }

    @Test
    public void should_be_buzz_when_divided_by_five() {


        int candidate = 5;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = fizzBuzz.fizzBuzz(candidate);
        String BUZZ = "Buzz";

        Assertions.assertSame(expected, BUZZ);

    }

    @Test
    public void should_be_fizz_and_buzz_when_divided_by_three_and_by_five() {

        // GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        int candidate = 15;


        // WHEN
        String expected = fizzBuzz.fizzBuzz(candidate);

        // THEN
        String INPUT_RES = "Fizz Buzz";

        Assertions.assertSame(expected, INPUT_RES);

    }

}

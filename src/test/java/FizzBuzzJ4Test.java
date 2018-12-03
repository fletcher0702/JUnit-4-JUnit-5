import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(DisplayExecutionTimeRunner.class)
public class FizzBuzzJ4Test {

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//    @Before
//    public void testBeforeEach() {
//
//        PrintStream out = new PrintStream(byteArrayOutputStream);
//        System.setOut(out);
//    }

    @After
    public void testAfterEach() {
    }

    @Test
    @Before
    public void should_be_fizz_when_divided_by_3() {
        int candidate = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = fizzBuzz.fizzBuzz(candidate);
        String FIZZ = "Fizz";

        System.out.println(byteArrayOutputStream.toString());

        Assertions.assertSame(expected, FIZZ);

    }

    @Test
    @After
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

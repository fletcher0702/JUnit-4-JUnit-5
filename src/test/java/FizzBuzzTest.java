import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(DisplayExecutionTimeExtension.class)
class FizzBuzzTest {

    @BeforeAll
    static void testBeforeAll(){
        System.out.println("Yo tests ?! ");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("It was nice to work with you !");
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("I'll Be Executed before each test :-) ");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("I'll be executed after each test ! ");
    }

    @Test
    void should_be_fizz_when_divided_by_3() throws InterruptedException {

        Thread.sleep(2000);
        int candidate = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = fizzBuzz.fizzBuzz(candidate);
        String FIZZ = "Fizz";

        Assertions.assertSame(expected, FIZZ);

    }

    @Test
    void should_be_buzz_when_divided_by_five() throws InterruptedException {

        Thread.sleep(2000);

        int candidate = 5;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = fizzBuzz.fizzBuzz(candidate);
        String BUZZ = "Buzz";

        Assertions.assertSame(expected,BUZZ);

    }

    @Test
    @Disabled
    void should_be_fizz_and_buzz_when_divided_by_three_and_by_five() throws InterruptedException {

        Thread.sleep(2000);

        // GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        int candidate = 15;


        // WHEN
        String expected = fizzBuzz.fizzBuzz(candidate);

        // THEN
        String INPUT_RES = "Fizz Buzz";

        Assertions.assertSame(expected,INPUT_RES);

    }

}

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class FizzBuzzJ4Test
{
    @Test
    public void number_divisible_by_3_should_display_fizz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // GIVEN
        int input = 3;

        // WHEN
        String result = fizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "Fizz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void number_divisible_by_5_should_display_buzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // GIVEN
        int input = 5;

        // WHEN
        String result = fizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "Buzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void number_divisible_by_3_and_5_should_display_fizz_buzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // GIVEN
        int input = 15;

        // WHEN
        String result = fizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "Fizz Buzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void number_not_divisible_by_3_or_5_should_display_the_number()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // GIVEN
        int input = 7;

        // WHEN
        String result = fizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "" + input;
        assertThat(result).isEqualTo(expected);
    }
}

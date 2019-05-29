import org.hamcrest.CoreMatchers;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.logging.Level;
        import java.util.logging.Logger;

        import static org.junit.Assert.*;

public class FindPrimeNumbersTest {

    @Test
    public void primeNumbersRecursive() throws MyException{
        List<Integer> result = new ArrayList<>();
        assertThat("Массив простых чисел", FindPrimeNumbers.primeNumbersRecursive(Arrays.asList(50, 11, 3, 4, 42), 0, result)
                ,CoreMatchers.hasItems(3,11));
    }

    @Test(expected = MyException.class)
    public void primeNumbersRecursive1() throws MyException{
        List<Integer> result = new ArrayList<>();
        FindPrimeNumbers.primeNumbersRecursive(Arrays.asList(), 0, result);
    }

    @Test
    public void isPrime() {
        assertTrue("Число простое", FindPrimeNumbers.isPrime(11));
    }

    @Test(expected = MyException.class)
    public void primeNumberNotRecursive1() throws MyException{
        FindPrimeNumbers.primeNumberNotRecursive(Arrays.asList());
    }

    @Test
    public void primeNumberNotRecursive() throws MyException{
        assertThat("Массив простых чисел", FindPrimeNumbers.primeNumberNotRecursive(Arrays.asList(50, 11, 3, 4, 42))
                ,CoreMatchers.hasItems(3,11));
    }
}
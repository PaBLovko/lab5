import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindPrimeNumbersTest {

    @Test
    public void primeNumbersRecursive(){
        try{
            assertThat("Массив простых чисел",new FindPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42))
                    .primeNumbersRecursive(),CoreMatchers.hasItems(3,11));
        }catch (MyException e) {System.out.println("Error. Not found elem");}

    }

    @Test
    public void isPrime() {
        assertTrue("Число простое", FindPrimeNumbers.isPrime(11));
    }

    @Test
    public void primeNumberNotRecursive(){
        try{
            assertThat("Массив простых чисел", new FindPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42))
                    .primeNumberNotRecursive(),CoreMatchers.hasItems(3,11));
        }catch (MyException e) {System.out.println("Error. Not found elem");}

    }
}
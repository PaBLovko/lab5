import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class CalcMinNumberTest {

    @Test
    public void minNumberNotResursive() throws MyException{
        assertEquals("Минимальное число", 3, CalcMinNumber.minNumberNotResursive(Arrays.asList(50, 19, 3, 4, 42)));
    }

    @Test(expected = MyException.class)
    public void minNumberNotResursive1() throws MyException{
        CalcMinNumber.minNumberNotResursive(Arrays.asList());
    }


    @Test
    public void minNumberResursive() throws MyException{
        assertEquals("Минимальное число",3, CalcMinNumber.minNumberResursive(Arrays.asList(50, 19, 3, 4, 42), 0,0));
    }

    @Test(expected = MyException.class)
    public void minNumberResursive1() throws MyException{
        CalcMinNumber.minNumberResursive(Arrays.asList(), 0,0);
    }
}
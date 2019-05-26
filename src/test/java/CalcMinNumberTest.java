import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class CalcMinNumberTest {
    private static Logger log = Logger.getLogger(CalcMinNumberTest.class.getName());

    @Test
    public void minNumberNotResursive() throws MyException{
        assertEquals("Минимальное число", 3, new CalcMinNumber(Arrays.asList(50, 19, 3, 4, 42))
                .minNumberNotResursive());
    }

    @Test
    public void minNumberResursive() throws MyException{
        assertEquals("Минимальное число",3, new CalcMinNumber(Arrays.asList(50, 19, 3, 4, 42))
                .minNumberResursive());
    }
}

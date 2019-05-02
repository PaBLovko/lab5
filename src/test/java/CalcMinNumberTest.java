import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalcMinNumberTest {

    @Test
    public void minNumberNotResursive(){
        try {
            assertEquals("Минимальное число", 3, new CalcMinNumber(Arrays.asList(50, 19, 3, 4, 42))
                    .minNumberNotResursive());
        }catch (MyException e) {System.out.println("Error. Not found elem");}
    }

    @Test
    public void minNumberResursive(){
        try{
            assertEquals("Минимальное число",3, new CalcMinNumber(Arrays.asList(50, 19, 3, 4, 42))
                    .minNumberResursive());
        }catch (MyException e) {System.out.println("Error. Not found elem");}
    }
}
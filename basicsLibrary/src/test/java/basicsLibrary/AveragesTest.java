package basicsLibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AveragesTest {
    @Test
    public void canCalculateAverage(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        Averages avg = new Averages();
        double result = avg.calcAvg(arr);

        assertTrue("these should match", result == 3.5);
    }

}
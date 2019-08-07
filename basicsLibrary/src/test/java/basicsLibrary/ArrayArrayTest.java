package basicsLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayArrayTest {

    @Test
    public void returnLowestAvgArr(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        ArrayArray arrArr = new ArrayArray();

        int[] result = arrArr.lowestAvgArr(weeklyMonthTemperatures);

        assertTrue("These should match ", result == weeklyMonthTemperatures[2]);
    }
}
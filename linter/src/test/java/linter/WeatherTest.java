package linter;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherTest {
    @Test
    public void canAnalyzeData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        Weather newAnalysis = new Weather();

        String actual = newAnalysis.analyzeWeather(weeklyMonthTemperatures);
        StringBuilder sb = new StringBuilder();
        sb.append("High: 72\n");
        sb.append("Low: 51\n");
        sb.append("Never saw temperature: 63\n");
        sb.append("Never saw temperature: 67\n");
        sb.append("Never saw temperature: 68\n");
        sb.append("Never saw temperature: 69\n");

        String expected = sb.toString();

        assertTrue(actual.equals(expected));
    }
}
package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review testReview;
    @Before
    public void setup() throws Exception{
        testReview = new Review("Amazing place!", "Joe Schmoe", 4);
    }

    @Test
    public void canPrintToString(){
        assertEquals("Review: Amazing place!, Author: Joe Schmoe, Number Of Stars: 4", testReview.toString());
    }
}
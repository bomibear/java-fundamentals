package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterReviewTest {

    TheaterReview testTheaterReview;
    TheaterReview testTheaterReviewWithMovie;
    @Before
    public void setup() throws Exception{
        testTheaterReview = new TheaterReview("Sweet theater", "Joe Schmoe", 4.00);
        testTheaterReviewWithMovie = new TheaterReview("Sweet movie", "Joe Schmoe", 5.00, "The Lion King");
    }

    @Test
    public void canPrintToStringJustTheaterReview(){
        assertEquals("Review: Sweet theater, Author: Joe Schmoe, Number Of Stars: 4.00" , testTheaterReview.toString());
    }

    @Test
    public void canPrintToStringTheaterReviewWithMovie(){
        assertEquals("Movie Name: The Lion King, Review: Sweet movie, Author: Joe Schmoe, Number Of Stars: 5.00" , testTheaterReviewWithMovie.toString());
    }

}
package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater testTheater;
    @Before
    public void setUp() throws Exception{
        LinkedList<String> currentMovies = new LinkedList<>();
        currentMovies.add("Spider Man");
        currentMovies.add("Toy Story");
        currentMovies.add("The Lion King");

        testTheater = new Theater("AMC", currentMovies);
    }

    @Test
    public void canPrintToString(){
        assertEquals("Theater Name: AMC, Currently Showing: [Spider Man, Toy Story, The Lion King], []", testTheater.toString());
    }

    @Test
    public void canAddTheaterReviewWithMovieName(){
        TheaterReview review = new TheaterReview("Tear jerker!","Joe Schmoe",5, "The Lion King");
        testTheater.addReview(review);
        assertEquals("Theater Name: AMC, Currently Showing: [Spider Man, Toy Story, The Lion King], [Movie Name: The Lion King, Review: Tear jerker!, Author: Joe Schmoe, Number Of Stars: 5.00]", testTheater.toString());
    }

    @Test
    public void canAddTheaterReviewWithNoMovieName(){
        TheaterReview review = new TheaterReview("Pretty clean spot","Joe Schmoe",4);
        testTheater.addReview(review);

        assertEquals("Theater Name: AMC, Currently Showing: [Spider Man, Toy Story, The Lion King], [Review: Pretty clean spot, Author: Joe Schmoe, Number Of Stars: 4.00]", testTheater.toString());
    }

    @Test
    public void canAddAMovie(){
        int lengthBeforeAddingAMovie = testTheater.currentMovies.size();
        testTheater.addMovie("Zootopia");
        int lengthAfterAddingAMovie = testTheater.currentMovies.size();
        assertTrue(lengthAfterAddingAMovie == lengthBeforeAddingAMovie + 1);
    }

    @Test
    public void canRemoveAMovie(){
        int lengthBeforeRemovingAMovie = testTheater.currentMovies.size();
        testTheater.removeMovie("Spider Man");
        int lengthAfterRemovingAMovie = testTheater.currentMovies.size();
        assertTrue(lengthAfterRemovingAMovie == lengthBeforeRemovingAMovie - 1);
    }

}
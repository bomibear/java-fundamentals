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
        assertEquals("Theater Name: AMC, Currently Showing: [Spider Man, Toy Story, The Lion King]", testTheater.toString());
    }

}
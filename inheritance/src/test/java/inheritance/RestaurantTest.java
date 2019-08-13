package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testRestaurant;
    @Before
    public void setUp() throws Exception{
        testRestaurant = new Restaurant("World Class Cafe", 4, "$");
    }

    @Test
    public void canPrintToString(){
        assertEquals("Name: World Class Cafe, Number of Stars: 4.00, Price Category: $, []", testRestaurant.toString());
    }

    @Test
    public void canAddReview(){
        Review review = new Review("Amazing place!", "Joe Schmoe", 4);
        testRestaurant.addReview(review);
        assertEquals("Name: World Class Cafe, Number of Stars: 4.00, Price Category: $, [Review: Amazing place!, Author: Joe Schmoe, Number Of Stars: 4.00]", testRestaurant.toString());
    }

    @Test
    public void cannotAddSameReview(){
        Review review = new Review("Amazing place!", "Joe Schmoe", 4);
        //when adding the same reviews:
        testRestaurant.addReview(review);
        testRestaurant.addReview(review);
        //only 1 will be added:
        assertEquals("Name: World Class Cafe, Number of Stars: 4.00, Price Category: $, [Review: Amazing place!, Author: Joe Schmoe, Number Of Stars: 4.00]", testRestaurant.toString());
    }

    @Test
    public void starRatingShouldChange(){
        Review review = new Review("Purdy good place!", "Joe Schmoe", 4);
        testRestaurant.addReview(review);

        Review review2 = new Review("Good eats!", "Joe Schmoe", 4);
        testRestaurant.addReview(review2);

        Review review3 = new Review("Amazing place!", "Joe Schmoe", 5);
        testRestaurant.addReview(review3);

        assertEquals(this.testRestaurant.numberOfStars, 4.33, 0.01);
    }
}
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
    public void testToString(){
        assertEquals("Name: World Class Cafe, Number of Stars: 4, Price Category $", testRestaurant.toString());
    }

}
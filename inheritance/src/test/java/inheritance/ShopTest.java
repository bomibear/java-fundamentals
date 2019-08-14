package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    public Shop testShop;
    @Before
    public void setUp() throws Exception{
        testShop = new Shop("The Sock Store", "Offers all the socks", "$");
    }

    @Test
    public void canPrintToString(){
        assertEquals("Store Name: The Sock Store, Description: Offers all the socks, Price Category: $", testShop.toString());
    }

    @Test
    public void canAddShopReview(){
        Review review = new Review("Has all the socks!", "Joe Schmoe", 5);
        testShop.addReview(review);
        assertEquals("Store Name: The Sock Store, Description: Offers all the socks, Price Category: $, [Review: Has all the socks!, Author: Joe Schmoe, Number Of Stars: 5.00]", testShop.toString());
    }

    @Test
    public void cannotAddSameReview(){
        Review review = new Review("Has all the socks!", "Joe Schmoe", 5);
        //when adding the same reviews:
        testShop.addReview(review);
        testShop.addReview(review);
        //only 1 will be added:
        assertEquals("Store Name: The Sock Store, Description: Offers all the socks, Price Category: $, [Review: Has all the socks!, Author: Joe Schmoe, Number Of Stars: 5.00]", testShop.toString());
    }

}
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

}
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;



    @Before
    public void setUp() {

        tobaccoStall = new TobaccoStall("Tobacco Factory", "Mr Smokey", "A1", 4);


        @Test
        public void canGetName () {
            assertEquals("Tobacco Factory", tobaccoStall.getName());
        }

        @Test
        public void canGetOwnerName () {
            assertEquals("Mr Smokey", tobaccoStall.getOwnerName());
        }

        @Test
        public void canGetParkingSpot () {
            assertEquals("A1", tobaccoStall.getParkingSpot());
        }

        @Test
        public void canGetRating () {
            assertEquals(4, tobaccoStall.getRating());
        }

        @Test
        public void canSellTobaccoToVisitors () {
            assertTrue(tobaccoStall.isAllowedTo(visitor1));

        }
    }
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;


    @Before
    public void setUp(){

        playground = new Playground("Kidz Zone", 9);
        visitor1 = new Visitor(20, 150, 80);

    }

    @Test
    public void canGetName() {
        assertEquals("Kidz Zone", playground.getName());
    }

  

    @Test
    public void canGetRating() {
        assertEquals (9, playground.getRating());
    }

    @Test
    public void canAddVisitorToPlayground() {
        assertTrue(playground.isAllowedTo(visitor1));
    }

}

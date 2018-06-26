import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;


    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("Oblivion", 10);
        visitor1 = new Visitor(20, 150, 80);
    }

    @Test
    public void canGetName() {
        assertEquals("Obliviion", rollercoaster.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, rollercoaster.getRating());
    }

    @Test
    public void canAddVisitorToRollercoaster() {
        assertTrue(rollercoaster.isAllowedTo(visitor1));

    }

}

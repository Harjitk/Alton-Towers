import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;


    @Before
    public void before() {
        visitor1 = new Visitor(20, 150, 80);
    }


    @Test
    public void hasAge(){
        assertEquals(20, visitor1.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(150, visitor1.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(80, visitor1.getMoney());
    }
}


//
//    Visitor has age, height, money
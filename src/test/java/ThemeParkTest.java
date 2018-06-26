import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;


    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark(attractions, stalls);
        Attraction attraction1 = new Rollercoaster("Oblivion", 10);
        Attraction attraction2 = new Dodgems("Dodgems", 8);
        Stall stall1 = new IceCreamStall("Ben and Jerrys", 5);
        attractions.add(attraction1);
        attractions.add(attraction2);
        stalls.add(stall1);
        visitor = new Visitor(20, 150, 80);
        ArrayList<IReviewed> reviewed = themePark.getAllReviewed();

    }
        @Test
        public void name hasAllReviewed {

    }
//
//    ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed
//}
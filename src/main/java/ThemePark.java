import java.util.ArrayList;

public class ThemePark {


        ArrayList<Attraction> attractions;
        ArrayList<Stall> stalls;

        public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
            this.attractions = attractions;
            this.stalls = stalls;
        }

        public ArrayList<IReviewed> getAllReviewed(){
            ArrayList<IReviewed> allReviews = new ArrayList<IReviewed>();
            allReviews.addAll(attractions);
            allReviews.addAll(stalls);
            return allReviews;

}

}
//
//    ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed
//
//    ThemePark has a method visit(Visitor, Attraction
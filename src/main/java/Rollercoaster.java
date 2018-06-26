public class Rollercoaster extends Attraction  implements ISecurity {

        public Rollercoaster(String name, int rating){
            super(name, rating);
            this.name = name;
        }

        public boolean isAllowedTo(Visitor visitor) {
            if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
                return true;
            }
            else
                return false;
        }



}

}
//
//Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

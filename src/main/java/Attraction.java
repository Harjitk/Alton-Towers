public abstract class Attraction implements IReviewed{

    String name;
    int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

  public String getName(){
        return name;
  }


    }






//
//Using a Attraction abstract class (which has a name),
//create some subclasses for Rollercoaster, Dodgems, Park, Playground
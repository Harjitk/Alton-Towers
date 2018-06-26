public abstract class Stall implements IReviewed {

    String name;
    String ownerName;
    int parkingSpot;
    int rating;


    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
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
//    Using a Stall abstract class (which has a name, ownerName and parkingSpot)
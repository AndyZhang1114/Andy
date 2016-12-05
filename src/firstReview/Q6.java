package firstReview;

/**
 * Created by jianbojia on 12/1/16.
 */

class Building {
    private int numFloors; // number of floors in building

    public Building() {
    }

    public Building(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "numFloors=" + numFloors +
                '}';
    }
}

class Residential extends Building {
    public int numBedrooms, numBathrooms;

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }
}

class OfficeBlg extends Building {
    private int numOffices; // number of offices
}

class House extends Residential {
    private int numGarages; // number of car garages

    public House() {
        numBedrooms = 4; // default number of bedrooms
        numBathrooms = 2; // default number of bathrooms
    }
}

class Apartment extends Residential {
    private int floor; // floor of the apartment in high-rise
    private boolean endUnit; // Is apartment an end unit?

    public Apartment() {
        numBedrooms = 2; // default number of bedrooms
        numBathrooms = 1; // default number of bathrooms
    }
}

public class Q6 {
    public static void main(String[] args) {
        Building building1 = new Building();
        Building building2 = new Building(6);
        System.out.println("building2 = " + building2);

        System.out.println(building2.getNumFloors());

        building2.setNumFloors(8);
        System.out.println(building2.getNumFloors());
    }
}

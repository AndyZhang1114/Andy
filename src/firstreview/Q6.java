package firstreview;

/**
 * Created by jianbojia on 12/1/16.
 */

class Building {
    private int numFloors; // number of floors in building
}

class Residential extends Building {
    private int numBedrooms, numBathrooms;
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

    }
}

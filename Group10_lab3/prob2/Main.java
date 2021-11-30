package prob2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // LandLord
        LandLord john = new LandLord("John Muhammad");

        john.addBuildings(new Building("Building 1", 1000, new ArrayList<Apartment>() {
            {
                add(new Apartment(500, 1));
                add(new Apartment(600, 2));
            }
        }));

        john.addBuildings(new Building("Building 2", 150, new ArrayList<Apartment>() {
            {
                add(new Apartment(1500, 1));
                add(new Apartment(1600, 2));
            }
        }));

        System.out.println(john);

        // //bldg profit
        for (Building bld : john.getBuildings()) {
            System.out.println(bld);
            for (Apartment a : bld.getApartments()) {
                System.out.println(a);
            }

        }
        System.out.println(john + " total profit is " + john.getTotalProfit());

    }
}

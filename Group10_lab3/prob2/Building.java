package prob2;

import java.util.ArrayList;

public class Building {
    private ArrayList<Apartment> apartments;
    private double maintenanceCost;
    private String name;

    //building with no name and appartments
    Building(){
        this.name = "NO NAME";
        this.maintenanceCost = 0d;
        this.apartments = new ArrayList<Apartment>();
    }

    // building with just name
    Building(String name){
        this.name = name;
        this.maintenanceCost = 0d;
        this.apartments = new ArrayList<Apartment>();
    }

    //apartment with 0 buildgs First
    Building(String name, double maintenanceCost){
        this.name = name;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<Apartment>();
    }

    //Building with appartments First
    Building(String name, double maintenanceCost, ArrayList<Apartment> apartments){
        this.name = name;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<Apartment>();
        this.apartments.addAll(apartments);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getMaintenanceCost(){
       return this.maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost){
        this.maintenanceCost = maintenanceCost;
    }

    public ArrayList<Apartment> getApartments(){
        return this.apartments;
    }

    public void setApartments(ArrayList<Apartment> apartments){
        this.apartments = apartments;
    }
    //add Appartments or rentApartments
    public void addAppartments(double rent, int roomNum){
        apartments.add(new Apartment(rent, roomNum));
    }

    private double totalRent(){
        double total = 0.0D;
        for(Apartment apartment : apartments){
            total += apartment.getRent();
        }
        return total;
    }

    public double getMonthProfit(){
        return this.totalRent() - this.maintenanceCost;
    }

    @Override
    public String toString(){
        return "Building " + name + " with " + this.apartments.size() +
         " apartmets  has total rent of " + this.totalRent() + " with net profit of " + this.getMonthProfit() + " and maintainance cost of " + this.getMaintenanceCost() ;
    }
}

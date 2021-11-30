package prob2;

import java.util.ArrayList;

public class LandLord {
    private ArrayList<Building> buildings;
    private String name;
    private double profit;
    LandLord(String name){
        buildings = new ArrayList<Building>();
        this.name = name;
        this.profit = 0;
    }

    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }

    public void setBuildings(ArrayList<Building> buildings){
        this.buildings = buildings;
    }

   
    public void addBuildings(String name){
        this.buildings.add(new Building(name));
    }

    public void addBuildings(Building building){
        this.buildings.add(building);
    }

    public double getTotalProfit(){
        for(Building building : this.buildings){
            this.profit += building.getMonthProfit();
        }
        return this.profit;
    }

    public String toString(){
        return name + " landlord of " + this.buildings.size() + " buildings";
    }

    
}

package prob2;

public class Apartment {
    private double rent;
    private int roomNum;

    //apartment with no room num and rent
    Apartment(){
        this.rent = 0d;
        this.roomNum = 0;
    }

    Apartment(int roomNum){
        this.rent = 0d;
        this.roomNum = roomNum;
    }
    
    Apartment(double rent, int roomNum){
        this.roomNum = roomNum;
        this.rent = rent;
    }

    public double getRent(){
        return this.rent;
    }

    public void setRent(double rent){
        this.rent = rent;
    }

    public int getRoomNum(){
        return this.roomNum;
    }

    public void setRoomNum(int roomNum){
        this.roomNum = roomNum;
    }

    @Override
    public String toString(){
        return "Room Number " + this.roomNum + " is rented for " + this.rent;
    }
}

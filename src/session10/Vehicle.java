package session10;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;
    public  Vehicle(String vId, String vName, int numWheels){
        System.out.println(" Contructor of vehicle : 3 parameters");
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;

    }

    public Vehicle() {
        System.out.println("contructor of vrhicle");
    }

    public  void accelerate(int speed){
        System.out.println(" Accelerating at: " + speed +"kmph");

    }

}

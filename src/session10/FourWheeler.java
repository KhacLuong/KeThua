package session10;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;
    public FourWheeler(){
        super();
        System.out.println(" contructor of FourWheller");
    };
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
//        vehicleNo = vId;
//        vehicleName =vName;
//        wheels = numWheels;
        super(vId, vName, numWheels);
        powerSteer = pSteer;
    }
    public  void showDetails(){
        System.out.println("vehivle no: "+ vehicleNo);
        System.out.println(" vehivle name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);
        if (powerSteer){
            System.out.println(" Power Steering: Yes");
        }
        else{
            System.out.println("Power Steering: No");
        }
    }
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maximum Accelerate" + speed +"kmph");
    }
}

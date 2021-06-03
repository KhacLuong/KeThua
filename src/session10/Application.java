package session10;

public class Application {
    public static void main(String[] args) {
        FourWheeler f1 = new FourWheeler();
        f1.showDetails();
        f1.accelerate(200);
        System.out.println();
        FourWheeler f = new FourWheeler("N.1", "No 1", 100, true);
        f.showDetails();
        f.accelerate(300);
    }
}

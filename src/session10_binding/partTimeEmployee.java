package session10_binding;

public class partTimeEmployee extends  Employee{
    String shift;

    public partTimeEmployee(String id, String name, int sal, String shift) {
        super(id, name, sal);
        this.shift = shift;
    }
    public  void  display(){
        calcComission(12);
        super.display();
        System.out.println("shift" + shift);
    }
}

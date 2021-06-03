package session10_binding;

public class Application {
    public static void main(String[] args) {
        Employee e = new Employee("A", "Employee1", 200);
        e.calcComission(2000F);
        e.display();

        System.out.println("----------------");
        partTimeEmployee p = new partTimeEmployee("B", "No.2", 200, "Shift B");
        p.display();
    }
}

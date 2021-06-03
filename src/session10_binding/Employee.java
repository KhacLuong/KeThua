package session10_binding;

public class Employee {
    String empId;
    String empName;
    int salary;
    float commission;
    public Employee(){

    }
    public Employee(String id, String name, int sal){
        empId = id;
        empName = name;
        salary = sal;
    }
    public void calcComission(float sales){
        if(sales > 1000){
            commission = (float) salary *20/100;
        }
        else {
            commission =0;
        }
    }
    public void  calcComission(int overtime){
        if(overtime > 8){
            commission = (float) salary/3;
        }
        else{
            commission = 0;
        }
    }
    public void  display(){
        System.out.println("empId" + empId);
        System.out.println("emMane" + empName);
        System.out.println(" salary: "+ salary);
        System.out.println("commission: " + commission);
    }
}

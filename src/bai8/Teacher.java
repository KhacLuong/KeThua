package bai8;

public class Teacher extends Person{
    private String qualifacations;

    public Teacher(String name, String address, String tel, String qualifacations) {
        super(name, address, tel);
        this.qualifacations = qualifacations;
    }

    public String getQualifacations() {
        return qualifacations;
    }
}

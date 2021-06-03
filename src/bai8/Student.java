package bai8;

public class Student extends Person{
    private String codeSt;

    public Student(String name, String address, String tel, String codeSt) {
        super(name, address, tel);
        this.codeSt = codeSt;
    }

    public String getCodeSt() {
        return codeSt;
    }
}

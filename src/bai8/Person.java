package bai8;

public class Person {
    private  String name;
    private  String address;
    private  String tel;

    public Person(String name, String address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }
}

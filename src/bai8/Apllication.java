package bai8;

public class Apllication {
    public static void main(String[] args) {
        Student S = new Student("Nam", "Ha noi", "0123456", "1234");
        System.out.println("thong tin sinh vien");
        System.out.println("name: " + S.getName());
        System.out.println("cadeSt: " + S.getCodeSt());
        System.out.println("address: " + S.getAddress());
        System.out.println("tel: " + S.getTel());
        System.out.println();
        System.out.println();
        Teacher T = new Teacher("Nu", "Ha Noi", "0135", "Master");
        System.out.println(" Thong tin giang vien");
        System.out.println("Name: "+ T.getName());
        System.out.println("Qualifacations: " + T.getQualifacations());
        System.out.println("Address: " + T.getAddress());
        System.out.println("Tel: " + T.getTel());
    }
}

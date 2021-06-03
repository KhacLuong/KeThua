package Bai_9;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        int choice =0;
        Scanner  scanner = new Scanner(System.in);
        phoneBook pb = new phoneBook();
        do{
            System.out.println("------------ Menu -----------------");
            System.out.println("---- 1. Insert phone   --");
            System.out.println("---- 2. Remove phone   --");
            System.out.println("---- 3. Update phone   --");
            System.out.println("---- 4. Search phone   --");
            System.out.println("---- 5.Sort            --");
            System.out.println("---- 6. Exit           --");
            System.out.println("------------ End Menu -----------------");

            System.out.println(" Enter yours choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println(" Enter name: ");
                    scanner.nextLine();
                     String name = scanner.nextLine();
                    System.out.println(" Enter Phone: ");
                    String phone = scanner.nextLine();
                    pb.insertPhone(name, phone);
                    break;
                }
                case 2:{
                    System.out.println("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    pb.removePhone(name);
                    break;
                }
                case 3:{
                    System.out.println(" Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println(" Enter new Phone: ");
                    String newphone = scanner.nextLine();
                    pb.updatePhone(name, newphone);
                    break;
                }
                case 4:{
                    System.out.println(" Enter name to search");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    pb.searchPhone(name);
                    break;
                }
                case 5: {
                    pb.sort();

                    for (int i = 0; i < pb.PhoneList.size(); i++) {
                        Object o = pb.PhoneList.get(i);
                        Phone p = (Phone) o;
                        System.out.println(" name" + p.name + "phone: " + p.phone);
                    }
                    break;
                }
                case 6:{
                    System.out.println(" bye");
                    break;
                }
                default:
                    System.out.println(" invalid option");
            }
        }while (choice!=6);
    }
}

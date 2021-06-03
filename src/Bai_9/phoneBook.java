package Bai_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public  class phoneBook extends Phone{
    ArrayList PhoneList = new ArrayList();
//    ArrayList<Phone> PhoneList = new ArrayList();
//    {
//        PhoneList.add("Oanh");
//        PhoneList.add(123);
//        PhoneList.add(545.55F);
//
//    }

    @Override
    public void insertPhone(String name, String phone) {
        boolean coincide = false;
        for (int i=0; i<PhoneList.size(); i++){
//          Object o = PhoneList.get(i);
//          Phone p = (Phone)o;
            Phone p = (Phone)PhoneList.get(i);
            if(p.name.equals(name)){
                coincide = true;
                if(p.phone.equals(phone)){
                    System.out.println("this phone is already on the PhoneList");
                }
                else{
                    p.phone = p.phone +":"+ phone;
                }
                break;
            }
            else{

            }
        }
        if(!coincide){
            System.out.println(" this Customer not on the List");
            System.out.println(" additions Customer on the List");
            Phone p = new phoneBook();
            p.name = name;
            p.phone =phone;
            PhoneList.add(p);

        }

    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean coincide = false;
        for(int i=0; i<PhoneList.size(); i++){
            Object o = PhoneList.get(i);
            Phone p = (Phone)o;
            if(p.name.equals(name)){
                coincide = true;
                p.phone = newphone;
                System.out.println(" finish Update phone for customer: " +name);
                break;
            }
         }
        if(!coincide){
            System.out.println(" not found Custome's :" + name);
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean coincide = false;
        for (int i =0; i<PhoneList.size(); i++){
            Object o = PhoneList.get(i);
            Phone p = (Phone)o;
            if(p.name.equals(name)){
                coincide = true;
                System.out.println("name: "+ p.name +"phone: " + p.phone);
                break;
             }
        }
        if (!coincide){
            System.out.println(" not found Customer's" + name);
            }
        }

    @Override
    public void removePhone(String name) {
        boolean coincide = false;
        for(int i =0; i<PhoneList.size(); i++){
            Phone p =(Phone)PhoneList.get(i);
            if(p.name.equals(name)){
                coincide = true;
                PhoneList.remove(p);
                System.out.println(" finish remove Customer's: " +name);
                break;
            }
        }
        if(!coincide){
            System.out.println(" not found Customer's: " + name);
        }

    }

    @Override
    public  void sort() {
        Collections.sort(PhoneList);
//        Collections.sort(PhoneList, new PhoneCompare());
    }
}

package Bai_9;

public abstract class Phone implements Comparable<Phone> {
      public String name;
      public String phone;



      public abstract void   insertPhone(String name, String phone);
      public abstract void   updatePhone(String name, String newphone);
      public abstract void   searchPhone(String name);
      public abstract void   removePhone(String name);
      abstract void sort();

      @Override
      public int compareTo(Phone o) {
            return this.name.compareTo(o.name);
      }
}

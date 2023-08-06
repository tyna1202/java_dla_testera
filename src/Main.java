import Model.User;
import Model.computer.*;

public class Main {
    public static void main(String[] args) {

       Hdd hdd = new Hdd("Samsung", 500);
       Ram ram = new Ram("AAA", 128);

       Computer mac = new Laptop("Mac", "Pro", hdd, ram, 100);
        System.out.println(mac.getRam().getSize());












    }


}
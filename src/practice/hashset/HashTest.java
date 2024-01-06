package practice.hashset;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class HashTest {
    public static void main(String[] args) {

        HashSet<employee> set = new HashSet<>();
        Calendar car = Calendar.getInstance();
        car.set(2000,1,1);
        employee e1 = new employee(1001,"ljf", car.getTime());
        set.add(e1);
        car.set(2001,3,1);
        employee e2 = new employee(1002, "kunkun", car.getTime());
        set.add(e2);
        car.set(2002,3,1);
        employee e3 = new employee(1003, "yifan", car.getTime());
        set.add(e3);
        System.out.println(set);
    }
}

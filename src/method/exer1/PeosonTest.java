package method.exer1;

public class PeosonTest {
    public static void main(String[] args) {
        Peoson p1 = new Peoson();
        //调用属性
        p1.name = "Tom";
        p1.age = 12;
        p1.gender = '男';

        p1.study();
        p1.addAge(2);

        int age = p1.showAge();
        System.out.println("age = " + age);

        Peoson p2 = new Peoson();
        System.out.println(p2.age);
        p2.addAge(2);
        System.out.println(p2.showAge());

    }
}

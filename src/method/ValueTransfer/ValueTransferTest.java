package method.ValueTransfer;

public class ValueTransferTest {

    public static void main(String[] args) {
        ValueTransferTest test = new ValueTransferTest();
        //对于基本数据类型的变量来说
        int m = 10;

        test.method1(m);
        System.out.println("m = " + m);//10

        //对于引用数据类型的变量来说
        Person p = new Person();
        p.age = 10;
        test.method2(p);
        System.out.println(p.age);//11

    }

    public void method1(int m){
        m++;
    }
    public void method2(Person p){
        p.age++;
    }

}

class Person{
    int age;
}

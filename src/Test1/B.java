package Test1;

class A {
    private int privateVar;
    A(int privateVar) {
        this.privateVar = privateVar;
    }
    boolean isEqualTo(A anotherA) {
        if(this.privateVar == anotherA.privateVar)
            return true;
        else
            return false;
    }
}
public class B {
    public static void main(String[] args) {
        A a = new A(1);
        A b = new A(2);
        System.out.println(a.isEqualTo(b));
    }
}
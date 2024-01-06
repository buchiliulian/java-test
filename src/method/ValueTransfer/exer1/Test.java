package method.ValueTransfer.exer1;

public class Test {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle,5);

        System.out.println("now radius is:" + circle.radius);
    }
}

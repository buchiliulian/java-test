package MyProject;

public class FirstJava {
    public static void main(String[] args){
        Animal.Rabbit a= new Animal.Rabbit();
        a.Ra();
        Animal.Tigger t = new Animal.Tigger();
        t.eat();
        t.Ti();
    }
}
class Animal{
    public void eat(){
        System.out.println(" can eat 1");
    }
    public void sleep(){
        System.out.println(" also can sleep");
    }

    static class Rabbit extends Animal{
        void Ra(){
            System.out.println("Rabbit ");
            eat();
            sleep();
        }
    }
    static class Tigger extends Animal{
        public void eat(){
            System.out.println("Tigger can eat 2");
        }
        void Ti(){
            System.out.println(" Tigger");
            sleep();
        }
    }
}

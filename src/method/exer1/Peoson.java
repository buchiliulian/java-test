package method.exer1;

public class Peoson {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age += addAge;
    }
}

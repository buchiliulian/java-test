package practice.PTA_11_08;

public class Main1 {
    public static void main(String[] args) {

        Son s = new Son();
    }
}

class Father {
    public Father() {
        System.out.println("Father的空参构造方法被执行了");
    }

    //Father类的空参构造方法，输出“Father的空参构造方法被执行了”
    public Father(int i) {
        System.out.println(i);
    }
}

class Son extends Father {
    public Son() {
        System.out.println("Son的空参构造方法被执行了");
    }
//Son类的空参构造方法，输出“Son的空参构造方法被执行了”
}
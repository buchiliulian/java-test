package MyProject;
import java.util.Scanner;
public class Fahrenheit {
    public static void main(String []args){

        double degF;
        //声明double型变量degF

        double degC;
        //声明double型变量degC
        Scanner in = new Scanner(System.in);

        System.out.print("请输入摄氏度：");
        degC=in.nextInt();

        degF=9.0/5 * degC + 32;

        System.out.println("摄氏温度"+ degC +"度对应华氏温度为："+ degF);
    }

}

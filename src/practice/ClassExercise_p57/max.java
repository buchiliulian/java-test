package practice.ClassExercise_p57;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        max test = new max();
        System.out.println(test.max(x,y,z));
    }

    public int max(int x,int y,int z){
        int IMax,Max;
        IMax = x > y ? x : y;
        Max = IMax > z ? IMax : z;
        return Max;
    }
}

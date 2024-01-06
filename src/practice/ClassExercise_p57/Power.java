package practice.ClassExercise_p57;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Power test = new Power();
        Scanner scanner = new Scanner(System.in);
        int x,y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(test.power(x,y));
    }


    public long power(int x,int y){
        int result = 1;
        for(int i = 0; i < y; i++){
            result *= x;
        }
        return result;
    }
}

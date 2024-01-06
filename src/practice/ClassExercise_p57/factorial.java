package practice.ClassExercise_p57;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long result;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorial test = new factorial();
        result = test.factorial(n);
        System.out.println(result);

    }

    public long factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

}

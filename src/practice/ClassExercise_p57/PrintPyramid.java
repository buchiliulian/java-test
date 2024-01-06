package practice.ClassExercise_p57;

import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();//换行
        }

    }
}

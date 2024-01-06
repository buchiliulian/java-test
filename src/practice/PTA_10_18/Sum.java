package practice.PTA_10_18;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / (i * 2);
        }
        System.out.printf("%.4f", sum);

    }
}

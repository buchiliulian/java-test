package practice.ClassExercise_p57;

import java.util.Scanner;

public class Year {
        public static void main(String[] args) {
            int year;
            Scanner sc = new Scanner(System.in);

            year = sc.nextInt();

            if ((year % 4 ==0 && year % 100 != 0) || year % 400 ==0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}

package practice;


import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数： ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("请输入"+ n +"个成绩");
        int score;
        int max = 0;
        for (int i = 0;i < n;i++){
            score = scanner.nextInt();
            arr[i] = score;
            max = (arr[i] > max) ? arr[i] : max;
        }

        System.out.println("最高分是："+ max);

        for (int j = 0;j < n;j++){
            if (arr[j] >= max-10){
                System.out.println("student " + j + " score is " + arr[j] + " grade is " + "A");
            }else if (arr[j] >= max-20){
                System.out.println("student " + j + " score is " + arr[j] + " grade is " + "B");
            }else if (arr[j] >= max-30){
                System.out.println("student " + j + " score is " + arr[j] + " grade is " + "C");
            }else {
                System.out.println("student " + j + " score is " + arr[j] + " grade is " + "D");
            }
        }

    }
}

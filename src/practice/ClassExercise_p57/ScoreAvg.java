package practice.ClassExercise_p57;

import java.util.Scanner;

public class ScoreAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        float[] score = new float[5];
        for(int i = 0; i < 5; i++){
            score[i] = scanner.nextFloat();
        }
        ScoreAvg test = new ScoreAvg();
        test.AVG(score);
    }

    public void AVG(float[] arr){
        float sum = 0;
        for (float i : arr) {
            sum += i;
        }
        System.out.println(sum/arr.length);
    }

}

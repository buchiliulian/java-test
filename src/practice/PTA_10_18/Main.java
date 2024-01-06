package practice.PTA_10_18;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int N, sum1=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j = 0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j = 0;j<N;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }if((N-1-j)==i){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}


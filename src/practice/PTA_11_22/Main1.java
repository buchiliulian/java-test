package practice.PTA_11_22;

import java.util.Arrays;
import java.util.Scanner;


public class Main1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        String data[]=str.split(" ");
        int sum=0;
        int[] b=new int[data.length];

        for(int i=0;i<b.length;i++)
        {
            b[i]=Integer.parseInt(data[i]);
        }
        Arrays.sort(b);
        for(int i=1;i<b.length-1;i++)
        {
            sum=sum+b[i];
        }
        System.out.println(sum/(b.length-2));
    }
}


/**
输入一个整形数组，数组里有正数也有负数。
        数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
        求所有子数组的和的最大值。
**/

package practice;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
        int i = getGreatestSum(arr);
        System.out.println(i);
    }

    public static int getGreatestSum(int[] arr){
        //用来保存最大子数组和v
        int greatestSum = 0;
        if(arr == null || arr.length == 0){
            return 0;
        }
        //用来保存当前连续子数组的和
        int temp = greatestSum;
        for(int i = 0;i < arr.length;i++){
            temp += arr[i];

            //如果temp小于0，则将temp置为0，表示重新开始计算连续子数组和。
            if(temp < 0){
                temp = 0;
            }

            if(temp > greatestSum){
                greatestSum = temp;
            }
        }
        //如果greatestSum仍然为0，则表示输入数组中全为负数，找出其中的最大值作为结果。
        if(greatestSum == 0){
            greatestSum = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(greatestSum < arr[i]){
                    greatestSum = arr[i];
                }
            }
        }
        return greatestSum;
    }
}

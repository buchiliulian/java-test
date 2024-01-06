package method.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

        System.out.println(test.getSum(100));

        System.out.println(test.getMul(5));

        System.out.println(test.f(10));
    }

    //举例一：计算1-100的自然数的和
    public int getSum(int num){
        if(num == 1){
            return 1;
        }else {
            return getSum(num - 1) + num;
        }
    }

    //举例二：计算n！
    public int getMul(int n){
        if(n == 1){
            return 1;
        }else {
            return getMul(n - 1) * n;
        }
    }

    //举例三：快速排序

    //举例四：汉诺塔游戏

    //举例5：斐波那契数列
    public int f(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else {
            return f(n - 1) + f(n - 2);
        }
    }

    /*
    * 举例6：File类的对象表示一个文件目录
    * 计算指定的文件目录大小，遍历指定文件目录中的所有文件，删除指定的文件目录
    * */
}

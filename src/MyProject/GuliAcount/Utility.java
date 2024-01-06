package MyProject.GuliAcount;

import java.util.*;

class GuliAcount{
    public static void main(String[] args){
        boolean isflag = true;
        //初始金额
        int balance = 10000;
        String info = "";   //收支说明
        String Detail ="";

        while(isflag){

            System.out.println("\n-----------------谷粒记账软件-----------------\n");
            System.out.println("                   1 收入明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退出\n");
            System.out.print("                   请选择(1-4)：");

            char selection = Utility.readMenuSelection();    //获取用户的选择

            switch (selection){
                case '1':
                    System.out.println("---------------当前收入明细记录---------------");
                    System.out.println("\t收支\t账户金额\t\t收支金额\t\t说明");
                    Detail += info + '\n';
                    System.out.println(Detail);
                    info = "";
                    System.out.println("--------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money1 = Utility.readNumber();
                    if(money1 > 0){
                        balance += money1;
                    }
                    System.out.print("本次收入说明：");
                    String addDescribing1 = Utility.readString();

                    info += "\t"+"收入\t" + balance + "\t  \t" + money1 + "\t\t\t" + addDescribing1;
                    System.out.println("------------------登记完成------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNumber();
                    if(money2 > 0){
                        balance -= money2;
                    }
                    System.out.print("本次支出说明：");
                    String addDescribing2 = Utility.readString();

                    info += "\t"+"支出\t" + balance + "\t  \t" + money2 + "\t\t\t" + addDescribing2;
                    System.out.println("------------------登记完成------------------");
                    break;
                case '4':
                    System.out.println("\n确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y')   isflag = false;
                    break;
            }
        }
    }

}

public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    //该方法读取键盘，如果用户键入’1’-’4’中的任意字符，则方法返回。返回值为用户键入字符
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("输入错误，请重新输入");
            } else break;
        }
        return c;
    }

    //该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);    //从键盘读取参数限制长度的一行内容（4）
            try {
                n = Integer.parseInt(str);     //整型数据Integer转换为基本数据类型int
                break;
            } catch (NumberFormatException e) {    //抓取转换失败的信息，并且输出提示
                System.out.print("金额过大");
            }
        }
        return n;
    }

    //该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    //该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    //构建函数，判断从键盘输入的字符是否超过最大长度限制
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("允许的最大字符限制为：" + limit + " ，请重新输入!");
                continue;
            }
            break;
        }

        return line;
    }
}


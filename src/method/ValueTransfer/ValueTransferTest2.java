package method.ValueTransfer;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + " n = " + n);

        //调用方法
        test.swap(m,n);
        System.out.println("m = " + m + " n = " + n);



    }

    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}

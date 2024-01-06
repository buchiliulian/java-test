package method.ValueTransfer;

public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + " n = " + data.n);

        test.swap(data);
        System.out.println("m = " + data.m + " n = " + data.n);

    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }


}

class Data{
    int m;
    int n;
}

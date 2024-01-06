class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 26; j++) {
                System.out.println(j);
            }
        }
    }
}
class LetterThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
            }
        }
    }
}
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread numberThread = new NumberThread();
        Thread letterThread = new Thread(new LetterThread());
        numberThread.start();
        letterThread.start();
    }
}
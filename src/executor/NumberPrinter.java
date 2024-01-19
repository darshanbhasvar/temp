package executor;

public class NumberPrinter implements Runnable {
    int x;
    NumberPrinter(int x){
        this.x = x;
    }

    @Override
    public  void run() {
        System.out.println("number is print by :" +x +" "+ Thread.currentThread().getName());
    }
}

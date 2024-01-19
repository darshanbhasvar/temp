package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello Darshan");
        System.out.println("----------------------");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++){

            if(i==5 || i==15){
                System.out.println();
            }
            NumberPrinter np = new NumberPrinter(i);
            executorService.execute(np);
        }
        executorService.shutdown();
    }
}

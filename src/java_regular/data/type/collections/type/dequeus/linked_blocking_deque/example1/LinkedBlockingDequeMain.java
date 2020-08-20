package java_regular.data.type.collections.type.dequeus.linked_blocking_deque.example1;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeMain {
    static BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(1);

    public static void main(String[] args) {
        ExecutorService exService = Executors.newFixedThreadPool(2);
        LinkedBlockingDequeMain main = new LinkedBlockingDequeMain();

        ElementAdd elementAdd = main.new ElementAdd();
        ElementGet elementGet = main.new ElementGet();
        exService.execute(elementAdd);
        exService.execute(elementGet);
        exService.shutdown();
    }

    // put(Object)
    class ElementGet implements Runnable {
        @Override
        public void run() {
            for(int i=0; i<5;i++){
                try {
                    blockingDeque.put("A"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // take()
    class ElementAdd implements Runnable {
        @Override
        public void run() {
            for(;;){
                try {
                    String s= blockingDeque.take();
                    System.out.println("Element received is: "+s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

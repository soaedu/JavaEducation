package java_regular.data.type.collections.type.queues.blocking_queue.example1;

import Utils.ArrayHelper;
import java.util.LinkedList;
import java.util.List;

public class BlockingQueueMain {
    static List queue = new LinkedList();
    private int limit = 10;

    public synchronized void enqueue(Object item) throws InterruptedException {
        Thread curThread = Thread.currentThread();
        String curThreadName = curThread.getName();
        System.out.println("\nenqueue: " +curThreadName);

        while (this.queue.size() == this.limit) {
            System.out.println(curThreadName + "...wait");
            wait();
        }

        if (this.queue.size() == 0) {
            System.out.println(curThreadName + "...notifyAll");
            notifyAll();
        }

        System.out.println(curThreadName + "...addItem: " +item);
        this.queue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        Thread curThread = Thread.currentThread();
        String curThreadName = curThread.getName();
        System.out.println("\ndequeue: " +curThreadName);

        while (this.queue.size() == 0) {
            System.out.println(curThreadName + "...wait");
            wait();
        }

        if (this.queue.size() == this.limit) {
            System.out.println(curThreadName + "...notifyAll");
            notifyAll();
        }

        System.out.println(curThreadName + " remove top item");
        return this.queue.remove(0);
    }

    public static void main(String[] args) {
        BlockingQueueMain main = new BlockingQueueMain();

        int arrSize = 40;
        int[] intArr = new int[arrSize];
        for (int i=1; i<arrSize; i++) {
            int temp = (i%2 == 0 ? 2: 1);
            intArr[i] = i*10 + temp;
        }
        ArrayHelper.printArray(intArr);

        int itemPortion = 10;
        String thread1Name = "Thread-1(enqueue)";
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("\n" +thread1Name+ ". Adding items.");
                for (int i=0; i<itemPortion; i++) {
                    int item = intArr[i];
                    main.enqueue(item);
                    System.out.println("" +thread1Name+ ". item: " +item);
                }
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        });
        thread1.setName(thread1Name);
        thread1.start();

        String thread2Name = "Thread-2(enqueue)";
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("\n" +thread2Name+ ". Adding items.");
                for (int i=(itemPortion); i<(2*itemPortion); i++) {
                    int item = intArr[i];
                    main.enqueue(item);
                    System.out.println("" +thread2Name+ ". item: " +item);
                }
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        });
        thread2.setName(thread2Name);
        thread2.start();

        String thread3Name = "Thread3(dequeue)";
        Thread thread3 = new Thread(() -> {
            try {
                System.out.println("\n" +thread3Name+ ". Getting items.");
                for (int i=0; i<itemPortion; i++) {
                    System.out.println("" +thread3Name+ ". item: " +main.dequeue());
                }
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        });
        thread3.setName(thread3Name);
        thread3.start();

        String thread4Name = "Thread4(dequeue)";
        Thread thread4 = new Thread(() -> {
            try {
                System.out.println("\n" +thread4Name+ ". Getting items.");
                for (int i=0; i<itemPortion; i++) {
                    System.out.println("" +thread4Name+ ". item: " +main.dequeue());
                }
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        });
        thread4.setName(thread4Name);
        thread4.start();
    }
}

package java_regular.data.type.collections.type.queues.linked_transfer_queue.example2;

import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueueMain {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> linkedTransferQueue = new LinkedTransferQueue<>();

        // tryTransfer(Object)
        new Thread(() -> {
            Random random = new Random(1);

            try {
                while (true) {
                    System.out.println("Producer is waiting to transfer message...");

                    Integer message = random.nextInt();
                    boolean added = linkedTransferQueue.tryTransfer(message);

                    if (added) {
                        System.out.println("Producer added the message - " + message);
                    }
                    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // take()
        new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Consumer is waiting to take message...");

                    Integer message = linkedTransferQueue.take();

                    System.out.println("Consumer received the message - " + message);

                    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

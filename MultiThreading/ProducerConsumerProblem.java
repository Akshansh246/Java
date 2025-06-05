class SimpleWaitModify {
    boolean isSignalled = false;
    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Consumer: Waiting for signal...");
        notify();
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SimpleWaitModify simpleWaitModify = new SimpleWaitModify();

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000); 
                simpleWaitModify.sendSignal();
                System.out.println("Producer: Signal sent!");
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted: " + e.getMessage());
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (simpleWaitModify) {
                SimpleWaitModify waitModify = simpleWaitModify;
                while (!waitModify.isSignalled) {
                    try {
                        System.out.println("Consumer: Waiting for signal...");
                        simpleWaitModify.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Consumer interrupted: " + e.getMessage());
                    }
                }
                System.out.println("Consumer: Received signal!");
            }
        });

        consumer.start();
        producer.start();
    }
}

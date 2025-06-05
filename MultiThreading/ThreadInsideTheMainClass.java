public class ThreadInsideTheMainClass {
    public static void main(String[] args) {
        System.out.println("Execution has started....");
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1");
            try {
                Thread.sleep(2000);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("Thread 2");
            try {
                Thread.sleep(2000);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        });
        t1.start();
        t2.start();
        System.out.println("All Threads Executed....");
    }
}

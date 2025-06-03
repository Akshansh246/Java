class MyThread extends Thread {
    public void run() {
        System.out.println("Helooo from MyThread");
        try {
            Thread.sleep(5000);
        } 
        catch (Exception e) {
            System.out.println("Thread was interrupted");
        }
        System.out.println("MyThread is running");
    }
    
}

public class GoingAgainstTheLaws {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }       
}

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running");
    }
}

public class FirstThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Main thread is running");              
    }
}

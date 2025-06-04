class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}

public class RunnAbleThreads {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Main thread is running");
    }   
}

//Runabble thread runs after the main thread starts

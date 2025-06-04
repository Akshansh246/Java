class fileDownloader implements Runnable {
    private String fileName;

    fileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Starting download for: " + fileName);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Downloading " + fileName + " " + (i * 20) + "% complete...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted for: " + fileName);
        }
        }
        System.out.println("Download completed for: " + fileName);
    }
}

public class DownloadSimulatorUsingRunnable {
    public static void main(String[] args) {
        fileDownloader file1 = new fileDownloader("File1.txt");
        fileDownloader file2 = new fileDownloader("File2.txt");
        Thread thread1 = new Thread(file1);
        Thread thread2 = new Thread(file2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();  //pause main thread until thread1 completes
            thread2.join();  //pause main thread until thread2 completes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("All downloads Completed.");
    }
}

class downloadFile{
    public static void file(String fileName) {
        for (int i = 0; i<=5 ; i++) {
            System.out.println("Downloading "+fileName + (" " + i*20) + "% complete...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }       
        }
        System.out.println(fileName+" Downloaded completely");
    }
}

class fileDownload extends Thread{
    String fileName;
    public fileDownload(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        downloadFile.file(fileName);
    }
}

public class DownloadSimulator {
    public static void main(String[] args) {
        fileDownload file1 = new fileDownload("File1.txt");
        fileDownload file2 = new fileDownload("File2.txt");

        file1.start();
        file2.start();
        
        System.out.println("All downloads completed.");  

    }
}

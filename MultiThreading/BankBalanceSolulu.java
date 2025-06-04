class MyBankAccount extends Thread{
    private static int balance = 1000;
    int withdrawAmount;
    MyBankAccount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void run() {
        synchronized (MyBankAccount.class) { 
            if (withdrawAmount <= balance) {
                System.out.println("Withdrawing: " + withdrawAmount);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted during withdrawal.");
                }
                balance -= withdrawAmount;
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal of: " + withdrawAmount);
            }
            System.out.println("Current Balance: " + balance);
        }
    }
}

public class BankBalanceSolulu {
    public static void main(String[] args) {
        MyBankAccount account1 = new MyBankAccount(500);
        MyBankAccount account2 = new MyBankAccount(900);
        
        Thread thread1 = new Thread(account1);
        Thread thread2 = new Thread(account2);
        
        thread1.start();
        thread2.start();

        try {
            thread1.join(); 
            thread2.join(); 
        } catch (Exception e) {
            System.out.println("Threads were interrupted: " + e.getMessage());
        }
        
        System.out.println("All transactions completed.");

    }
}


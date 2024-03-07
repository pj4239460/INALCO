// Interruption d'un thread
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1); // Pause de 1 milliseconde
        t.interrupt(); // Interruption du thread t
        t.join(); // Attente de la fin du thread t
        System.out.println("end");
    }
}

class MyThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}
// // Multithreading
// public class Main {
//     public static void main(String[] args) {
//         Thread t = new MyThread();
//         t.start(); // Démarrer un nouveau thread
//     }
// }

// class MyThread extends Thread {
//     @Override
//     public void run() {
//         System.out.println("démarrer un nouveau thread !");
//     }
// }

// Multithreading
// public class Main {
//     public static void main(String[] args) {
//         Thread t = new Thread(new MyRunnable());
//         t.start(); // Démarrer un nouveau thread
//     }
// }

// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("démarrer un nouveau thread !");
//     }
// }

// Multithreading
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("démarrer un nouveau thread !");
        });
        t.start(); // Démarrer un nouveau thread
    }
}
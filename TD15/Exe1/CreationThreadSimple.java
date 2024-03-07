public class CreationThreadSimple {
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread en exécution");
        }
    }

    public static void main(String[] args) {
        System.out.println("Début du programme");
        MyThread monThread = new MyThread();
        monThread.start();
        System.out.println("Fin du programme");
    }
}

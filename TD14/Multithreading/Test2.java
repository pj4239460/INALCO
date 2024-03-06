// Multithreading
public class Test2 {
    public static void main(String[] args) {
        System.out.println("main commence...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread exécute...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("thread termine.");
            }
        };
        t.start();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {}
        System.out.println("main termine...");
    }
}
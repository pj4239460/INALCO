public class Test1 {
    public static void main(String[] args) {
        System.out.println("main commence...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread exécute...");
                System.out.println("thread termine.");
            }
        };
        t.start();
        System.out.println("main termine...");
    }
}
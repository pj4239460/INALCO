public class InterruptionThread {
    public static class MyThread extends Thread {
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Thread en exécution");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrompu");
                    break; // Optionnel, sort de la boucle si le thread est interrompu
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Début du programme");
        MyThread monThread = new MyThread();
        monThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        monThread.interrupt();
        System.out.println("Fin du programme");
    }
}

// Dans cet exemple de code, la méthode isInterrupted() joue en effet un rôle important. Elle est utilisée pour vérifier si le thread courant a été interrompu. Si un autre thread appelle la méthode interrupt() sur ce thread, isInterrupted() retournera true, ce qui permettra de sortir de la boucle et de terminer proprement le thread.

// Dans cet exemple de code, isInterrupted() est utilisé dans la condition de la boucle pour décider si le corps de la boucle doit continuer à s'exécuter. Lorsque vous appelez monThread.interrupt() dans la méthode main, si le thread MyThread est en état d'attente à cause de Thread.sleep(1000), une InterruptedException sera lancée, et l'état d'interruption sera effacé (c'est-à-dire que isInterrupted() retournera false). Dans le bloc de gestion des exceptions, vous utilisez break pour sortir de la boucle, donc même si l'état d'interruption est réinitialisé à false, le thread s'arrêtera à cause de l'instruction break.

// L'idée derrière cette conception est que, dans de nombreux cas, un thread peut ne pas entrer immédiatement dans un état où une InterruptedException peut être lancée (comme lors de l'appel à sleep, wait, etc.). Dans ces situations, la méthode isInterrupted() fournit un mécanisme permettant de sonder régulièrement si le thread doit s'arrêter, même s'il n'exécute pas actuellement d'opération pouvant être interrompue.

// En résumé, isInterrupted() dans ce fragment de code offre un moyen élégant de sortir de la boucle, assurant ainsi que le thread peut se terminer rapidement et en toute sécurité après avoir reçu un signal d'interruption. J'espère que cette explication est suffisamment claire.
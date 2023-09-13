import java.lang.Thread;

public class RunnableInterfaceExercice implements Runnable{
    RunnableInterfaceExercice() {

    }

    public static void main(String[] args) {
       RunnableInterfaceExercice obj = new RunnableInterfaceExercice();
       Thread thread = new Thread(obj);
       thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'exécution...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

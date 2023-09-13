import java.io.*;
import java.lang.Thread;

public class SimpleThreadExercice extends Thread{

    public SimpleThreadExercice() {

    }

    public static void main(String[] args) {
        SimpleThreadExercice thread = new SimpleThreadExercice();
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Salut du thread!");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {

        }

        }

    }


public class SynchronizationExercice implements Runnable {
    private static int sold;
    private final int retireSum;


    public SynchronizationExercice(int soldTotal, int sumRetired) {
        sold = soldTotal;
        this.retireSum = sumRetired;
    }

    public void retireAmountMoney(int nbrThread) {
        synchronized (this) {
            sold = sold - this.retireSum;
            System.out.println("Thread-" + nbrThread + " a retiré " + this.retireSum);
        }

    }

    public void retireAmountMoney2(int nbrThread) {
        synchronized (this) {
            sold = sold - this.retireSum;
            System.out.println("Thread-" + nbrThread + " a retiré " + this.retireSum);

        }
    }

    public static void main(String[] args) {
        SynchronizationExercice obj = new SynchronizationExercice(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Thread thread = new Thread(obj);
        //Thread thread1 = new Thread(obj::retireAmountMoney);
        //Thread thread2 = new Thread(obj::retireAmountMoney2);

        thread.start();
        //thread1.start();
        //thread2.start();

       try {
           thread.join();
            //thread1.join();
            //thread2.join();
        }catch (InterruptedException e) {

        }
        System.out.println("Solde final:" + sold);
    }

    @Override
    public void run() {
        retireAmountMoney(1);
        retireAmountMoney2(2);
    }
}

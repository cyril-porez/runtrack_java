

public class BanqueExercice extends ComptesBancaire {

    private int sold;
    public BanqueExercice(int sold) {
        super(sold);
    }

    static void calculateInterestSavingAccount(int interest, int sumSavingSold) {
        float division = (float) (interest) / 100;
        float calculateInterest = division * sumSavingSold;
        float newSavingSold = sumSavingSold + calculateInterest;
        System.out.println(division);
        System.out.println("Intérêts ajoutés: " + calculateInterest + ". Nouveau solde:" + newSavingSold);
    }

    public static void main(String[] args) {
        BanqueExercice banque = new BanqueExercice(Integer.parseInt(args[0]));
        banque.courantAccount();
        calculateInterestSavingAccount(Integer.parseInt(args[2]), Integer.parseInt(args[1]));
    }
}

public class ComptesBancaire {

    protected int sold;

    public ComptesBancaire(int money) {
        this.sold = money;
    }

    public void depose(int money) {
        this.sold = money + this.sold;
        System.out.println(money + "€ déposés. Nouveau solde: " + this.sold + "€");
    }

    public void retire(int money) {
        this.sold = this.sold - money;
        if (this.sold > 0) {
            System.out.println(money + "€ retirés. Nouveau solde: " + this.sold + "€");
        }
        else {
            System.out.println("Tentative de retrait de " + money + "€... Solde insuffisant!");
        }
    }

    public void courantAccount() {
        System.out.println("Test");
    }

    public void savingAccount() {

    }
}

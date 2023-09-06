public class Calculatrice {
    private double firstNumber;
    private double secondNumber;

    public Calculatrice(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void additionner() {
        double somme = this.firstNumber + this.secondNumber;
        System.out.println("Somme: " + somme);
    }

    public void multiplier() {
        double multiplier = this.firstNumber * this.secondNumber;
        System.out.println("Produit: " + multiplier);
    }

    public void soustraire() {
        double soustraire = this.firstNumber - this.secondNumber;
        System.out.println("Différence: " + soustraire);
    }

    public void diviser() {
        double division = this.firstNumber - this.secondNumber;
        System.out.println("Division: " + division);
    }

}

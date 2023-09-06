import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le premier nombre: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Entrer le second nombre: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        Calculatrice maCalculatrice = new Calculatrice(firstNumber, secondNumber);
        maCalculatrice.additionner();
        maCalculatrice.soustraire();
        maCalculatrice.multiplier();
        maCalculatrice.diviser();
    }
}
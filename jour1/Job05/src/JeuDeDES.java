import java.util.Random;

public class JeuDeDES {
    public static void main(String[] args) {
        Random nbr = new Random();

        int De1 = nbr.nextInt(6) + 1;
        int De2 = nbr.nextInt(6) + 1;
        int somme = De2 + De1;

        System.out.println("Dé 1: " + De1);
        System.out.println("Dé 2: " + De2);
        System.out.println("Somme: " + somme);
    }
}

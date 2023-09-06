import java.util.Scanner;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Veuillez saisir votre nom: ");
        String var2 = var1.nextLine();
        System.out.println("Hello, " + var2 + "!");
        var1.close();
    }
}

import java.util.function.IntPredicate;

public class LambdaArgumentExercice {

    public static void main(String[] args) {
        String string = args[0];
        int lengthMin = Integer.parseInt(args[1]);

        LamdaValidator size = (str, length) -> str.length() > length;

        if (size.validate(string, lengthMin)) {
            System.out.println("La chaîne " + string + " a une longueur supérieur à " + lengthMin);
        }
        else {
            System.out.println("La chaîne " + string + " a une longueur inférieur à " + lengthMin);
        }
    }
}

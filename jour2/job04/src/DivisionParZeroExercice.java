public class DivisionParZeroExercice {
    public static int division(int numerator, int denominator) {
        try {
            int calculator = 0;
            System.out.println(calculator = numerator / denominator);

        } catch(Exception exception) {
            System.out.println("Erreur: DivisionParZeroException");
        }
        return 0;
    }
    public static void main(String[] args) {
        int result = division(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}

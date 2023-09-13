public class VoitureExercice {

    public static void main(String[] args) throws Exception {
        Voiture maVoiture = new Voiture(Integer.parseInt(args[0]));
        maVoiture.start();
        maVoiture.accelerer();

        maVoiture.stop();
    }
}

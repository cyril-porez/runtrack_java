public class Voiture extends Exception {

    private String brand;
    private String color;
    private int speed;

    public Voiture(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("La voiture démare.");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisé à " + this.speed + " km/h.");
    }

    public void accelerer() throws Exception {
        try {
                this.speed += 10;
                System.out.println("La vitesse est maintenant de " + this.speed + "km/h.");

        }catch (Exception exception) {
            System.out.println("Erreur: VitesseLimiteDepasseException");
        }

    }
}

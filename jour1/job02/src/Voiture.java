public class Voiture {

    private String brand;
    private String color;
    private int speed;

    public Voiture(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("La voiture démare.");
    }

    void stop() {
        this.speed = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisé à " + this.speed + " km/h.");
    }

    void accelerer() {
        this.speed += 10;
        System.out.println("La vitesse est maintenant de " + this.speed + "km/h.");
    }
}

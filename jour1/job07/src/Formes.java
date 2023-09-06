import java.text.DecimalFormat;
public class Formes {
    private int radius;
    private int side;

    public Formes(int radius, int side) {
        this.radius = radius;
        this.side = side;
    }


    public void calculateSquareArea() {
        double area = this.side * this.side;
        System.out.println("Aire du carré de côté " + this.side + ": " + area);
    }
    public void calculateRingArea() {
        double area = (this.radius * this.radius) * Math.PI;
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedArea = df.format(area);
        System.out.println("Aire du cercle de rayon " + this.side + ": " + formattedArea);
    }
}

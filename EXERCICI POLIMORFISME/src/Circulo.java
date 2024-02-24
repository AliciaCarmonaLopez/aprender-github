public class Circulo extends Figure{
    private double r;
    public Circulo(double radio) {
        super();
        this.r = radio;
    }

    @Override
    public double area() {
        return Math.PI*this.r*this.r;
    }
}

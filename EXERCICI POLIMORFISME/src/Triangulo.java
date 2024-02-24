public class Triangulo extends Figure{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double area (){
        return this.base*this.altura/2;
    }
}

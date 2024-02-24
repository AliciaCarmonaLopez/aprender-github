public class GestorFiguras {
    public static void main(String[] args) {
            Figure[] v = new Figure[4];

            v[0] = new Rectangulo(5,3);
            v[1] = new Circulo(5);
            v[2] = new Quadrat(5);
            v[3] = new Circulo(120);

            double res = suma(v);

            System.out.println("suma: "+res);

            print(v);

            sort(v);

            print(v);

    }
}

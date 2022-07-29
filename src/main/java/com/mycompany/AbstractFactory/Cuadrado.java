package FiguraGeometrica;


public class Cuadrado extends Bidimensional {

    public Cuadrado(int x, int y, int lado) {

        super(x, y, lado, lado);

    } 
    public void defineLado(int s) {

        defineDimension1(s);
        defineDimension2(s);

    } 
    public int obtenerLado() {

        return obtenerDimension1();

    } 
    public String obtenerNombre() {

        return "Cuadrado";

    }
    public int obtenerArea() {

        return obtenerLado() * obtenerLado();

    }
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "lado", obtenerLado());

    } 

} 

package FiguraGeometrica;

public class Cubo extends Tridimensional {

    public Cubo(int x, int y, int lado) {

        super(x, y, lado, lado, lado);

    } 
    public void defineLado(int lado) {

        defineDimension1(lado);
        defineDimension2(lado);
        defineDimension3(lado);

    }
    public int obtenerLado() {

        return obtenerDimension1();

    } 
    public int obtenerArea() {

        return 6 * (obtenerLado() * obtenerLado());

    } 
    public int obtenerVolumen() {

        return obtenerLado() * obtenerLado() * obtenerLado();

    } 
    public String obtenerNombre() {

        return "Cubo";

    } 
    // String representation of the Cube object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "lado", obtenerLado());

    } 

}

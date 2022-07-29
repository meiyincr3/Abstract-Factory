package FiguraGeometrica;


public class Esfera extends Tridimensional {

    public Esfera(int x, int y, int radio) {

        super(x, y, radio, radio, radio);

    }
    public void setRadius(int r) {

        defineDimension1(r);
        defineDimension2(r);
        defineDimension3(r);

    } 
    public int obtenerRadio() {

        return obtenerDimension1();

    } 
    public String obtenerNombre() {

        return "Esfera";

    } 
    public int obtenerArea() {

        return (int) ((4 * Math.PI) * (obtenerRadio() * obtenerRadio()));

    } 
    public int obtenerVolumen() {

        return (int) (4.0 / 3.0 * Math.PI * obtenerRadio() * obtenerRadio() * obtenerRadio());

    } 
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "radio", obtenerRadio());

    } 

}

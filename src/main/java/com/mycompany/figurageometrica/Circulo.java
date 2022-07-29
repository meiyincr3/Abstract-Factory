package FiguraGeometrica;


public class Circulo extends Bidimensional {

    public Circulo(int x, int y, int radio) {

        super(x, y, radio, radio);

    } 
    public void defineRadio(int radio) {

        defineDimension1(radio);
        defineDimension2(radio);

    } 
    public int obtenerRadio() {

        return obtenerDimension1();

    } 
    public String obtenerNombre() {

        return "Círculo";

    } 

    public int obtenerArea() {

        return (int) (Math.PI * (obtenerRadio() * obtenerRadio()));

    } 
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "radio", obtenerRadio());

    } 

} 


package FiguraGeometrica;

public class Triangulo extends Bidimensional{

    public Triangulo(int x, int y, int side) {

        super(x, y, side, side);

    }
  
    public void defineLado(int s) {
        defineDimension1(s);
        defineDimension2(s);
    } 
    public int obtenerBase() {
       return obtenerDimension1();
    }
    
    public int obtenerAltura() {
        return obtenerDimension2();
    }
           
    public String obtenerNombre() {
        return "Triángulo";
    } 
    public int obtenerArea() {
        return (obtenerBase() * obtenerAltura())/2;
    }
    
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "Base", obtenerBase(), "Altura", obtenerAltura());
        
        

    } // end method toString

} // end class Square

    



package FiguraGeometrica;

public class Tetraedro extends Tridimensional{
    
    public Tetraedro(int x, int y, int lado) {
        super(x, y, lado, lado, lado);
    } 
    public void defineLado(int lado) {
        defineDimension1(lado);
        defineDimension2(lado);
        defineDimension3(lado);

    } 
    public int obtenerArista() {
        return obtenerDimension1();
    } 

    public int obtenerLado() {
        return obtenerDimension2();
    } 
    
    public int obtenerLado3() {
        return obtenerDimension3();
    }
    
    public int obtenerArea() {  
        return (int) (Math.sqrt(3)* Math.pow(obtenerArista(), 2 ));
    } 
    
    public int obtenerVolumen() {
        return (int) ((Math.pow(obtenerArista(),3) * Math.sqrt(2))/ 12);
    } 
    
    public String obtenerNombre() {
        return "Tetraedro";

    } 
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "Arista", obtenerArista());

    } // end method toString

   //@Override
    //public double obtenerArea() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
  //  public int obtenerVolumen() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }

//} // end class Cube


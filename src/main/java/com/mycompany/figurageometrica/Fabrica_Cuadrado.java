
package FiguraGeometrica;

public class Fabrica_Cuadrado implements Fabrica_Figuras{
    
    private int x;		
    private int y;
    private int lado;
    
    @Override
    public Bidimensional crearFiguraBidimensional(int x, int y, int lado){
        return new Cuadrado(x,y,lado);
    }
    @Override
    public Tridimensional crearFiguraTridimensional(int x, int y, int lado){
        return new Cubo(x,y,lado);  
    }
    
}

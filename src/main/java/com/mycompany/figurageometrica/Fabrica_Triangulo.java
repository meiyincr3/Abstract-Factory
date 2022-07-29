
package FiguraGeometrica;

public class Fabrica_Triangulo implements Fabrica_Figuras{
    
    private int x;		
    private int y;
    private int lado;
    
    @Override
    public Bidimensional crearFiguraBidimensional(int x, int y, int lado){
        return new Triangulo(x,y,lado);
    }
    @Override
    public Tridimensional crearFiguraTridimensional(int x, int y, int lado){
        return new Tetraedro(x,y,lado);  
    }
    
}


package FiguraGeometrica;

public interface Fabrica_Figuras {
    
    public Bidimensional crearFiguraBidimensional(int x, int y, int lado);
    public Tridimensional crearFiguraTridimensional(int x, int y, int lado);
    
}

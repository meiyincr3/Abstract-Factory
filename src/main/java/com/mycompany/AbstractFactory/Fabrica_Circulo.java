
package FiguraGeometrica;
public class Fabrica_Circulo implements Fabrica_Figuras{
    
    private int x;		
    private int y;
    private int radio;
    
    @Override
    public Bidimensional crearFiguraBidimensional(int x, int y, int radio){
        return new Circulo(x,y,radio);
    }
    @Override
    public Tridimensional crearFiguraTridimensional(int x, int y, int radio){
            return new Esfera(x,y,radio);  
    }
    
}

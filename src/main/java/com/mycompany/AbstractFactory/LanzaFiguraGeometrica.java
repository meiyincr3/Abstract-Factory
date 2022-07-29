package FiguraGeometrica;

public class LanzaFiguraGeometrica {

    public static void main(String args[]) {
        
        Fabrica_Figuras fabrica;
        Bidimensional bidimensional;
        Tridimensional tridimensional;
        
        fabrica= new Fabrica_Cuadrado();
        bidimensional= fabrica.crearFiguraBidimensional(5, 5, 5);
        tridimensional= fabrica.crearFiguraTridimensional(8, 8, 8);
        
        System.out.println(bidimensional.obtenerNombre());
        System.out.println(tridimensional.obtenerNombre()+" | "+tridimensional.obtenerVolumen());
        
        
        fabrica= new Fabrica_Circulo();
        bidimensional= fabrica.crearFiguraBidimensional(22, 88, 4);
        tridimensional= fabrica.crearFiguraTridimensional(8, 89, 2);
        
        System.out.println(bidimensional.obtenerNombre());
        System.out.println(tridimensional.obtenerNombre()+" | "+tridimensional.obtenerVolumen());

    } // end main
}

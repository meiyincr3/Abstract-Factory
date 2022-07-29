package FiguraGeometrica;

public abstract class FiguraGeometrica {

    private int x;		// x coordinate
    private int y;		// y coordinate

    public FiguraGeometrica(int x, int y) {

        this.x = x;
        this.y = y;

    } 
    public void defineX(int x) {

        this.x = x;

    }
    public void defineY(int y) {

        this.y = y;

    } 
    public int obtenerX() {

        return x;

    }
    public int obtenerY() {

        return y;

    } 
    public String toString() {

        return String.format("(%d, %d)", obtenerX(), obtenerY());

    } 
    public abstract String obtenerNombre();

} 

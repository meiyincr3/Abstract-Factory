package FactoryMethod;

import FiguraGeometrica.*;


public class FabricaTrianguloBidimensional implements FabricaBidimensional{

	@Override
	public Bidimensional crearFiguraBidimensional() {
		return new Triangulo(6,6,12);
	}

}

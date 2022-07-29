package FactoryMethod;

import FiguraGeometrica.*;


public class FabricaCuadradoBidimensional implements FabricaBidimensional{

	@Override
	public Bidimensional crearFiguraBidimensional() {
		return new Cuadrado(4,4,8);
		
	}

}

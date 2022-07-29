package FactoryMethod;

import FiguraGeometrica.*;


public class FabricaCirculoBidimensional implements FabricaBidimensional{

	@Override
	public Bidimensional crearFiguraBidimensional() {
		return new Circulo(3,3,9);
	}

}

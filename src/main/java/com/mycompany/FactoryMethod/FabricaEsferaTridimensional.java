package FactoryMethod;

import FiguraGeometrica.*;


public class FabricaEsferaTridimensional implements FabricaTridimensional{

	@Override
	public Tridimensional crearFiguraTridimensional() {
		return new Esfera(3,3,9);
	}

}

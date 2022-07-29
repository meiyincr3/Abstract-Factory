package FactoryMethod;

import FiguraGeometrica.*;

public class FabricaCuboTridimensional implements FabricaTridimensional{

	@Override
	public Tridimensional crearFiguraTridimensional() {
		return new Cubo(4,4,8);
	}

}

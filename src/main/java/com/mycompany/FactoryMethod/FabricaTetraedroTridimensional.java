package FactoryMethod;

import FiguraGeometrica.*;


public class FabricaTetraedroTridimensional implements FabricaTridimensional{

	@Override
	public Tridimensional crearFiguraTridimensional() {
		return new Tetraedro(6,6,12);
	}

}

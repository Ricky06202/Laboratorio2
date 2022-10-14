package metodos;

import datos.Funcion;

public class Secante extends CalculoRaices{

	public Secante(Funcion funcion, double primero, double segundo) {
		super(funcion);
        setAnterior(segundo);
        setUltima(primero);
	}

	@Override
	public Double calcularSiguiente() {
        double respuesta = getUltima() - (getFuncion().evaluar(getUltima()) * 
        (getAnterior() - getUltima())) / 
        (getFuncion().evaluar(getAnterior()) - getFuncion().evaluar(getUltima()));

        setAnterior(getUltima());
        setUltima(respuesta);
		return respuesta;
	}

}

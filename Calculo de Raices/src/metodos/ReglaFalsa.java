package metodos;

import datos.Funcion;

public class ReglaFalsa extends CalculoRaices {

    private double a, b;

	public ReglaFalsa(Funcion funcion, double a, double b) {
		super(funcion);
        this.a = a;
        this.b = b;
	}

	@Override
	public Double calcularSiguiente() {
        // respuesta = b - (f(b) * (a-b)) / (f(a) - f(b))
        if(!estaEnElIntervalo(a, b)) return null;

		double respuesta = b - (getFuncion().evaluar(b) * (a - b)) /
        (getFuncion().evaluar(a) - getFuncion().evaluar(b));

        if(estaEnElIntervalo(a, respuesta))
            b = respuesta;
        else
            a = respuesta;

        setAnterior(getUltima());
        setUltima(respuesta);
		return respuesta;
	}

    private boolean estaEnElIntervalo(double a, double b){
        return getFuncion().evaluar(a)*getFuncion().evaluar(b) < 0;
    }
}

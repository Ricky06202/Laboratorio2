package metodos;

import datos.Funcion;

/**
 * CalculoRaices
 
 */
public abstract class CalculoRaices 
{
    private Funcion funcion;

	private double ultima = 0, anterior = 0, tolerancia;

	public CalculoRaices(Funcion funcion){
        this.funcion = funcion;
    }

	public abstract Double calcularSiguiente();

    public double calcularErrorRelativo(){
        return Math.abs((ultima - anterior) / ultima * 100);
    }
    
    public double getTolerancia() {
		return tolerancia;
	}

	public void setTolerancia(double tolerancia) {
		this.tolerancia = tolerancia;
	}

    public Funcion getFuncion() {
		return funcion;
	}

    public double getAnterior() {
		return anterior;
	}

	public void setAnterior(double anterior) {
		this.anterior = anterior;
	}

	public double getUltima() {
		return ultima;
	}

	public void setUltima(double ultima) {
		this.ultima = ultima;
	}
    
}
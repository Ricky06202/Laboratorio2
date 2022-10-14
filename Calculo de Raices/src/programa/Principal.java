package programa;

import datos.Funcion;
import datos.Ventana;

public class Principal 
{
	public static void main(String[] args) 
	{
		Funcion funcion = (x) -> -0.5*Math.pow(x,2) + 2.5*x + 4; 
		String textoFuncion = "-0.5x^2 + 2.5x + 4";
		new Ventana(funcion, textoFuncion);

		
		// CalculoRaices metodoUsado = new Biseccion(funcion, 5, 9);
		// metodoUsado.setTolerancia(0.0001);

		// int contador = 0;
		// System.out.println("N     Xr        Er");
		// while(metodoUsado.calcularErrorRelativo() > metodoUsado.getTolerancia() || contador <= 2)
		// {
		// 	Double siguiente = metodoUsado.calcularSiguiente();
		// 	if(siguiente == null){
		// 		System.out.println("ERROR ESTA FUERA DEL INTERVALO");
		// 		break;
		// 	}
				
		// 	System.out.printf("%d   %f  %f\n",++contador, siguiente,
		// 	metodoUsado.calcularErrorRelativo());

		// }

	}
}

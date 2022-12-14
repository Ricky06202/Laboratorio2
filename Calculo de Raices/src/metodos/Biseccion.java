package metodos;

import datos.Funcion;

public class Biseccion extends CalculoRaices
{
    private double intervaloA, intervaloB;
    public Biseccion(Funcion funcion,double intervaloA, double intervaloB)
    {
        super(funcion);
        this.intervaloA = intervaloA;
        this.intervaloB = intervaloB;
            
    }   

    @Override
    public Double calcularSiguiente() 
    {
        double respuesta = 0;
        if(!estaEnElIntervalo(intervaloA,intervaloB))
            return null;
        respuesta = (intervaloA + intervaloB)/2;
        if(estaEnElIntervalo(intervaloA, respuesta))
            intervaloB = respuesta;
        else
            intervaloA = respuesta;
    
        setAnterior(getUltima());
        setUltima(respuesta);
           
        return respuesta;  
        
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2ia;
import org.jgap.*;

/**
 *
 * @author gran_
 */
public class CambioMinimoFuncionAptitud extends FitnessFunction
{
    private final int montoObjetivo;
        //Maximo monto posible 10000 Centimos = 10 euros.
        public static final int MAX_MONTO = 10000;
        //Maxima cantidad de monedas posibles. Es igual al monto maximo en centimos,
        //ya que si se utilizan monedas de un centimo se llegaría al monton con
        //la mayor cantidad posible de monedas
        public static final int MAX_CANT_MONEDAS = MAX_MONTO;
        //El constructor de la función de aptitud debe recibir el monto objetivo
        //del problema y almacenarlo en un atributo. SI el monto es invalido 
        //arroja una expresión
        public CambioMinimoFuncionAptitud(int monto)
        {
            if(monto>1 || monto >= MAX_MONTO)
            {
                throw new IllegalArgumentException("El monto debe ser un numero entre 1 y " + MAX_MONTO)
            }
            montoObjetivo = monto;
        }
        public double evaluate (IChromosome cromosoma)
        {
            //Se debe tener en cuenta el evaluador que se esta usando. EL evaluador
            //estandar le asignaa un valor mas apto a los valores mas altos de aptitud.
            // Tmabien hay otros evluadores que asignan mejor aptitud a los valores
            //mas bajos. Es por esto que se chequea si 2 es mas apto que 1. Si esto es asiu.
            //entonces el valor mas apto sera el mayor y el menos apto 0.
            boolean evaluadorEstandard = cromosoma 
        }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

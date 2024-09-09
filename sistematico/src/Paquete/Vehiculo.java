
package Paquete;

/**
 *
 * @author Carlos Mora
 */
public abstract class Vehiculo {
    private final String matricula;
    private final String modelo;
    private int tarifaentrada;
    public Vehiculo (String matricula, String modelo, int tarifaentrada){
         if(tarifaentrada <= 0)
            throw new IllegalArgumentException("La tarifa no puede ser igual a 0"); //validacion que la tarifa sea mayor que 0
         this.matricula = matricula;
         this.modelo = modelo;
         this.tarifaentrada = tarifaentrada;
     }
	
    public String getMatricula()
    {
        return matricula;
    }
    public String getModelo()
    {
        return modelo;
    }
    
    public double getTarifaEntrada()
    {
        return tarifaentrada;
    }
    
    public void setTarifaEntrada(int tarifaentrada)//validacion que la tarifa sea mayor que 0
    {
        if(tarifaentrada <= 0)
            throw new IllegalArgumentException("La tarifa tiene que mayor a 0");
    this.tarifaentrada = tarifaentrada;
    }
	
    public abstract double getPago();
	
    @Override
    public String toString() {
        return String.format("%s: %s%n %s: %s%n %s: %.2f", "Numero de Maricula es: ", getMatricula(), "Modelo del vehiculo", 
	       getModelo(), "Tarifa a pagar", getTarifaEntrada());
    }
}


package Paquete;

/**
 *
 * @author Carlos Mora
 */
public class Taxi extends Vehiculo{
    private String numLicencia;
	
    public Taxi(String matricula, String modelo, int tarifaentrada, String numLicencia){
        super(matricula, modelo, tarifaentrada);
        this.numLicencia = numLicencia;
    }
    
    public void setNumLicencia(String numLicencia){
        this.numLicencia = numLicencia;
    }
	
    public String getNumlicencia()
    {
        return numLicencia;
    }

    @Override
    public double getPago() {
        return super.getTarifaEntrada();
    }
	
    @Override
    public String toString(){
        return String.format("%n%s %n%s: %s%n", super.toString(), "Licencia", getNumlicencia(),
                "pago", getPago());
    }
       
   
}


package Paquete;

/**
 *
 * @author Carlos Mora
 */
public class AutoBus extends Vehiculo{
    private int numPlazas;
    
    public AutoBus(String matricula, String modelo, int tarifaentrada, int noPlazas) {
        super(matricula, modelo, tarifaentrada);
        this.numPlazas = noPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public double getPago() {
        return super.getTarifaEntrada() * getNumPlazas();
    }


    @Override
    public String toString() {
        return String.format("%n%s %n%s: %s%n", super.toString(), "Numero de asientos del autobus es: ", getNumPlazas());
    }
    
}

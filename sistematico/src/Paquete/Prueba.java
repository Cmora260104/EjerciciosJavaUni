
package Paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Mora
 */
public class Prueba {
    public static void main(String[] args) {
        String sms = "";
        
        Taxi taxista = new Taxi("RI 999", "mercedez benz", 10, "HG4543HF3H53HG");
        AutoBus busero = new AutoBus("RS 758", "marco polo", 10, 20);

	Vehiculo[] ob = new Vehiculo[2];

	ob[0] = taxista;
	ob[1] = busero;
	
        for (Vehiculo nuevo : ob) {
            sms += String.format("%s pago: %.2f", nuevo.toString(), nuevo.getPago());
	}

	JOptionPane.showMessageDialog(null, sms);
    }
}

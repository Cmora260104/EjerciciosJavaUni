
package Paquete;

import javax.swing.JOptionPane;

public class Principal {
 
/**
 *
 * @author Carlos Mora
 */
    public static void main(String[] arg){
        EmpleadoPorComision empleado1;
        empleado1 = new EmpleadoPorComision( 10.0, 0.12,"Juan", "Mora", "12002");
        JOptionPane.showMessageDialog(null, empleado1);
    }
}
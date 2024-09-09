
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Mora
 */
public class Prueba {
     public static void main (String [] args)
    {
        String numerovalidar;
        boolean respuesta;
        
        do
        {
        numerovalidar = JOptionPane.showInputDialog(null, "Ingrese el número a verificar");
        
        respuesta = Validar (numerovalidar);  
        
        } while(respuesta == true);   
        
        
        int numero;
        
        numero = Integer.parseInt(numerovalidar);
    }
    
    
    public static boolean Validar (String valor)
    {
        boolean respuesta;
        
        if (valor.matches("[0-9]*"))
        {
           JOptionPane.showMessageDialog(null, "Genial, este es un número");
           respuesta = false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No es un número, ingreselo de nuevo");
            respuesta = true;
        }    
        
        return respuesta;
    }        
}
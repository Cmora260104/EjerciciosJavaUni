
package Paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Mora
 */
public class principal {
    
    public static void main(String[] arg){
        double x1,y1;
        double x2,y2;
        double x3,y3;
        double x4,y4;
        double y5;
        
        double ban;//simulamos una bandera
        do{   // el do es para que se repita hasta que ingrese un numero valido
            try{  //en este pedazo de codigo puede pasar un error
                ban = 0;
                Senox seno = new Senox();
                Cosx cos = new Cosx();
                Ex euler = new Ex();
                Lnx logaritmoN = new Lnx();
                Tanx tan = new Tanx(); 
                
                double grados = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite valor en grados"));//Pedimos los grados
                
                //ultimas operaciones convertir a radianes
                x1 = Math.toRadians(grados);
                y1 = seno.senx(x1); //mandamos a llamar el metodo del seno
                x2 = Math.toRadians(grados);
                y2 = cos.cosx(x2);//mandamos a llamar el metodo del coseno
                x3 = Math.toRadians(grados);
                y3 = euler.ex(x3);
                x4 = Math.toRadians(grados);
                y4 = logaritmoN.LogN(x4);
                y5 = tan.Tanx(y1, y2);
                
                JOptionPane.showMessageDialog(null, "El valor del sen: " + y1 +"\n" + "El valor de cos: " + y2 + "\n" + "exponencial: " 
                        + y3 +"\n" + "El valor del LogN: " + y4 +"\n" +"Tangente" +y5);
                
            }catch(Exception e){  //si pasa el error le mandamos un mensaje que lo que ingreso no es valido que vuelva a ingresar datos
                
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero " + "\n" + "El programa acepta solo numeros");
                
                ban = 1;//si pasa la exepcion osea ocurre el error para que no cumpla el while y se repita varias veces
            }
        }while(ban != 0);//cumple el do y se ejecuta las operaciones
    }
    
}

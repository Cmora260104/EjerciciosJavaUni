	package ejercicios_flor;
import java.util.Scanner;
public class eje_3 {
	public static void main (String[] args) { 
		//Determinar el valor de una variable Y=X* C-2
		Scanner leer= new Scanner (System.in);
		final double c=2.5;
		double x=2;
		double a = x * c-2;
		System.out.println("a) Sabiendo que X=2, Y= " +a);
		System.out.println("Digete el valor de X");
		x=leer.nextDouble();
		a = x * c-2;
		
		System.out.println("b)Y="+a);
		
		
		

	
		 
		 
				
}
}
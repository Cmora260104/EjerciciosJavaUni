package ejercicios_flor;
import java.util.Scanner;
public class eje_19 {
	public static void main(String[] args)
	{
		// Determinar si la persona es votante
		Scanner leer= new Scanner(System.in);			
		
			
		System.out.println("Ingrese su edad=");
		int edad= leer.nextInt();
		if (edad >=16) 
		{
			System.out.println("La persona es votante");
		}
		else {
			System.out.println("La persona no es votante");
		}
		
		
	}

	
}

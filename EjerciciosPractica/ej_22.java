package ejercicios_flor;
import java.util.Scanner;

public class ej_22 {
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		double interes;
		System.out.println("Ingrese el capital prestado: ");
		double capital = leer.nextDouble();
		
		if (capital > 10000.0)
		{
			interes = capital * 0.07;
		}
		else 
		{
			interes = capital * 0.06;
		}
		System.out.println("Capital: " + (capital+interes) + ", intereses: " + interes);
	}
}

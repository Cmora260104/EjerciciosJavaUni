package ejercicios_flor;
import java.util.Scanner;

public class ej_24 {
	public static void main(String[] args)
	{
		double y;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor de A: ");
		double a = leer.nextDouble();
		
		if (a >= 0.0)
		{
			y = Math.pow(2, a);
		}
		else
		{
			y = a + 5;
		}
		System.out.println("Y = " + y);
	}
}

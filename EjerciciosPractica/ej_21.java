package ejercicios_flor;
import java.util.Scanner;

public class ej_21 {
	public static void main(String[] args)
	{
		double x;
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite un numero ");
		double num = leer.nextDouble();
		
		if (num<0)
			 x = Math.pow(num, 4);
		else
			 x = Math.pow(num, 2);

		System.out.println("El valor de x es: " + x);
	}
}

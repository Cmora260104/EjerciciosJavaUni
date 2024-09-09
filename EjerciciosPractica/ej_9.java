package ejercicios_flor;
import java.util.Scanner;

public class ej_9 {
	public static final double PI = 3.14159;
	public static void main(String[] args)
	{
		//area de un cilindro
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el radio del cilindro: ");
		double r = leer.nextDouble();
		System.out.println("Ingrese la altura del cilindro: ");
		double h = leer.nextDouble();
		double a = 2 * PI * r * (r + h);
		System.out.println("El area del cilindro es de " + a + " unidades cuadradas");
		leer.close();
		
	}
}

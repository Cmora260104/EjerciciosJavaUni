package ejercicios_flor;
import java.util.Scanner;

public class ej_10 {
	public static void main(String[] args)
	{
		//calcular la fuerza de un cuerpo
		Scanner leer = new Scanner(System.in);
		System.out.println("Masa: ");
		double m = leer.nextDouble();
		System.out.println("Aceleracion: ");
		double a = leer.nextDouble();
		double f = m * a;
		System.out.println("Fuerza = " + f);
		leer.close();
	}
}

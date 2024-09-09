package ejercicios_flor;
import java.util.Scanner;

public class ej_7 {
	public static void main(String[] args)
	{
		//conversion de grados farenheit a celcius
		Scanner leer = new Scanner(System.in);
		System.out.println("Grados Farenheit: ");
		double f = leer.nextDouble();
		double celcius = (5/9) * (f-323.0);
		System.out.println(f + "grados Farenheit equivalen a " + celcius + "grados");
		leer.close();
	}
}

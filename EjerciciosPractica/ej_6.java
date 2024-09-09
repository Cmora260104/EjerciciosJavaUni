package ejercicios_flor;
import java.util.Scanner;
public class ej_6 {
	public static void main(String[] args)
	{
		//conversion de kg a libras
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su peso en libras: ");
		double peso = leer.nextDouble();
		double kg = peso * 2.2;
		System.out.println("Su peso en kg es: " + kg);
		leer.close();
	}
}

package ejercicios_flor;
import java.util.Scanner;

public class ej_4 {
	public static void main(String[] args)
	{ 
		//raiz de numero cualquiera
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		double n = leer.nextDouble();
		double r = Math.sqrt(n);
		System.out.println("La raiz cuadrada de " +n+ " es de " +r);
		leer.close();
	}
}

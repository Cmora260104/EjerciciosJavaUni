package ejercicios_flor;
import java.util.Scanner;

public class ej_8 {
	public static void main(String[] args)
	{
		//area de un triangulo conociendo sus lados
		Scanner leer = new Scanner(System.in);
		System.out.println("Programa que calcula el area de un triangulo conociendo sus lados");
		System.out.println("Digite el valor del primer lado: ");
		double a = leer.nextDouble();
		System.out.println("Digite el valor del segundo lado: ");
		double b = leer.nextDouble();
		System.out.println("Digite el valor del tercer lado: ");
		double c = leer.nextDouble();
		
		double S = (a + b + c) / 2;
		double A = Math.sqrt(S * (S-a) * (S-b) * (S-c));
		System.out.println("El area del triangulo es de " + A + "unidades cuadradas");
		leer.close();
		
	}
}

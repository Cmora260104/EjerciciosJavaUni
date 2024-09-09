package ejercicios_flor;
import java.util.Scanner;

public class ej_25 {
	public static void main(String[] args)
	{
		//Determinar si es un numero es divisible entre 3
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num=leer.nextInt();
		if (num % 3 == 0)
		{
			System.out.println("El numero es divisible entre 3");
			
		}
		else {
			System.out.println("El numero no es divisible entre 3");
		}
	}
}

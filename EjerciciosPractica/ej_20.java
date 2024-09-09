package ejercicios_flor;
import java.util.Scanner;

public class ej_20 {
	public static void main(String[] args) {
	//Determinar si es un numero es par
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num=leer.nextInt();
		if (num % 2 == 0)
		{
			System.out.println("El numero es par");
			
		}
		else {
			System.out.println("El numero es impar");
		}
		
}
}

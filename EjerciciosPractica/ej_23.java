package ejercicios_flor;
import java.util.Scanner;

public class ej_23 {
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la calificacion del alumno: ");
		int nota = leer.nextInt();
		
		if (nota >= 60)
			System.out.println("Aprobado");
		else 
			System.out.println("Reprobado");
	}
}

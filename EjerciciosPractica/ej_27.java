package ejercicios_flor;
import java.util.Scanner;

public class ej_27 {
	public static void main (String[] args) {
		// Determinar precio pantalones
		Scanner leer = new Scanner(System.in);
		int precio_total;
		System.out.print("Ingrese la cantidad de pantalones comprados");
		int cantidad=leer.nextInt();
		if (cantidad >3) {
			precio_total= cantidad * 10;	
		}
		else {
			precio_total=cantidad * 12;
		}
		
		System.out.println("El precio total es="+ precio_total);
		
	}
	
}

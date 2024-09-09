package ejercicios_flor;
import java.util.Scanner;
public class ej_30 {
	 public static void main(String[] args) {
		 // Determinar la lectura de dos numeros
		 Scanner leer = new Scanner(System.in);
		 double x,y;
		 double operacion;
			 System.out.println("Ingresar el valor de x");
			 x= leer.nextDouble();
			 System.out.println("Ingresar el valor de y");
			 y=leer.nextDouble();
			if (x<0 && y<0) {
				operacion = Math.pow(x, 2) +  Math.pow(x, 2);
				System.out.println("a) " + operacion);
			 }
			else if (x<0 && y>0) {
				operacion = y-x;
				System.out.println("b) " + operacion);
			 }
			else if (x>0 && y<0) {
				operacion = x / y;
				System.out.println("c) " + operacion);
			 }
			if (x>0 && y>0) {
				if (x> y) {
					operacion = x+ y;
				}
				else {
					operacion = Math.sqrt(x);
				}
				System.out.println("d) " + operacion);
			 }
	 }
}

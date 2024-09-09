package ejercicios_flor;
import java.util.Scanner;
public class ej_5 {
	public static void main(String[] args) {
		//Evaluar la funcion Y= 5X^4 + 2X^3 + 3X^2 + 7
		Scanner leer = new Scanner(System.in);
		double x=1;
		double a=	5* Math.pow(x, 4) + 2 * Math.pow(x, 3)+ 3* Math.pow(x, 2) + 7 ;
		System.out.println(" a) sabiendo que x=1, Y="+a);

		x=leer.nextDouble();
		a=5* Math.pow(x, 4) + 2 * Math.pow(x, 3)+ 3* Math.pow(x, 2) + 7 ;
		
		Scanner determinar = new Scanner(System.in);
		System.out.println("b)Sabiendo que x es un numero cualquiera,Y="+a);
		System.out.println("Ingrese el valor de x");
		x=determinar.nextDouble();
		
		
		
}
}
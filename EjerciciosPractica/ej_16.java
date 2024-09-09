package ejercicios_flor;
import java.util.Scanner;
public class ej_16 {
	 public static void main(String[] args) {
		 // Determinar soluciones de ecuaciones lineales con dos incognitas
		 	Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese el valor de a");
			double a=leer.nextDouble();
			System.out.println("Ingrese el valor de b");
			double b=leer.nextDouble();
            System.out.println("Ingrese el valor de c");
		    double c=leer.nextDouble();
		    System.out.println("Ingrese el valor de d");
		    double d=leer.nextDouble();
		    System.out.println("Ingrese el valor de e");
		    double e=leer.nextDouble();
		    System.out.println("Ingree el valor de f");
		    double f=leer.nextDouble();
		    double det=(a*e)-(b*d);
		    double detx=(c*e)-(f*b);
		    double dety=(a*f)-(d*c);
		    double x= detx/det;
		    double y= dety/det;
		    System.out.println("El valor de x es="+x);
		    System.out.println("El valor de y es="+y);
		  
		 
		 
}
}
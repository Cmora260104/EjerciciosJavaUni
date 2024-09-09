package ejercicios_flor;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		//Determinar el area de un circulo
				Scanner leer= new Scanner (System.in);
				System.out.println("radio del circulo:");
				double radioc= leer.nextDouble();
				System.out.print("El area del circulo es:"+ Math.PI * radioc * radioc);
	}

}

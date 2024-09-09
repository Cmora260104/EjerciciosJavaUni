package ejercicios_flor;

import java.util.Scanner;

public class ej_28 {
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num=leer.nextInt();
		System.out.println("Ingrese un numero");
		int num2=leer.nextInt();
		
		if ((num > 0 && num2 < 0) || (num < 0 && num2 > 0))
		{
			num *= -1;
			num2 *= -1;
			System.out.println(num);
			System.out.println(num2);
			
		}
	}

	
}

package ejercicios_flor;
import java.util.Scanner;
public class ej_1 {
	  public static void main(String[] args) {
	//Determinar base, altura y area
		Scanner determinar=new  Scanner (System.in);
	System.out.println ("base: ");
	double base=determinar.nextDouble();
	System.out.println("altura:");
	double altura=determinar.nextDouble();
	double area= base*altura;
	System.out.println ("base= "+base);
	System.out.println("altura=" + altura);
	System.out.println("area="+area);
}
}
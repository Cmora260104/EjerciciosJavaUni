package ejercicios_flor;

import java.util.Scanner;

public class ej_15 {

    public static void main(String[] args) {
    	//determinante de matriz de segundo orden
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los valores de la matriz de segundo orden");

        System.out.print("Ingrese el valor a11: ");
        double a11 = leer.nextDouble();

        System.out.print("Ingrese el valor a12: ");
        double a12 = leer.nextDouble();

        System.out.print("Ingrese el valor a21: ");
        double a21 = leer.nextDouble();

        System.out.print("Ingrese el valor a22: ");
        double a22 = leer.nextDouble();

        double determinante = (a11 * a22) - (a12 * a21);

        System.out.println("El determinante de la matriz es: " + determinante);

        leer.close();
    }
}

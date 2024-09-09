package ejercicios_flor;

import java.util.Scanner;

public class ej_14 {
    public static void main(String[] args) {
    	//solucion lineal de ax+b =0
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = leer.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = leer.nextDouble();

        if (a == 0) {
            System.out.println("La ecuación no tiene solución.");
        } else {
            double x = -b / a;
            System.out.println("La solución de la ecuación es: x = " + x);
        }

        leer.close();
    }
}


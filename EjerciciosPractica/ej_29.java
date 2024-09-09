package ejercicios_flor;

import java.util.Scanner;

public class ej_29 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = leer.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = leer.nextInt();

        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        int diferencia = mayor - menor;

        System.out.println("La diferencia entre el mayor y el menor es: " + diferencia);
    }
}

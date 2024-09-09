package ejercicios_flor;

import java.util.Scanner;

public class ej_12 {
	//promedio de n notas
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de notas: ");
        int n = leer.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = leer.nextDouble();
            suma += nota;
        }

        double promedio = suma / n;
        System.out.println("El promedio de las " + n + " notas ingresadas es: " + promedio);

        leer.close();
    }
}


package ejercicios_flor;

import java.util.Scanner;

public class ej_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double masa, velocidad, altura, constanteGravedad;
        double energiaCinetica, energiaPotencial, energiaTotal;

        System.out.print("Introduce la masa del cuerpo en kg: ");
        masa = sc.nextDouble();

        System.out.print("Introduce la velocidad del cuerpo en m/s: ");
        velocidad = sc.nextDouble();

        System.out.print("Introduce la altura del cuerpo en metros: ");
        altura = sc.nextDouble();

        System.out.print("Introduce la constante de gravedad en m/s^2: ");
        constanteGravedad = sc.nextDouble();

        energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);
        energiaPotencial = masa * altura * constanteGravedad;
        energiaTotal = energiaCinetica + energiaPotencial;

       
        System.out.println("La energía total del cuerpo es: " + energiaTotal + " J");
    }
}


package ejercicios_flor;
import java.util.Scanner;

public class ej_18 {
   public static void main(String[] args) {
      int num, numInvertido = 0;
      Scanner leer = new Scanner(System.in);

      // Pedir al usuario que ingrese un número de tres cifras
      do {
    	  System.out.print("Ingrese un número de tres cifras: ");
          num = leer.nextInt();
      } while (num<100 || num >1000);
      
      
      // Invertir el número
      while (num != 0) {
         int cifra = num % 10;
         numInvertido = numInvertido * 10 + cifra;
         num /= 10;
      }

      // Mostrar el número invertido
      System.out.println("El número invertido es: " + numInvertido);
   }
}


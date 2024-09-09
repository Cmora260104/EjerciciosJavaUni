
package Paquete;

/**
 *
 * @author Carlos Mora
 */
public class Cosx {
    public double cosx(double valor){
        int n = 10; //precision
        double cos, dividendo, divisor, signo;
        
        cos = 0; //inicializamos en 0 osea 1 
        
        for (int i = 0; i < n; i++) { //repite de i = 0 hasta valor de n para una mejor aproximacion
            //calculo de todo el for i
            dividendo = 1; //inicializar dividendo en 1 para que luego sea x^2 luego x^3 etc.
            for (int j = 0; j < 2*i; j++) { // es parecido al seno solo cambia el 2 * i
                dividendo = dividendo * valor;
            }
            divisor = 1; //inicializar el divisor en 1 puesto que el factorial de 0 es 1
            for (int j = 1; j <= 2*i; j++) {//es parecido al seno solo cambia el 2 * i planteado en la formula
                divisor = divisor * j;//primero se multiplica 1x1, 1x2, 1X3 hasta que salga del for y tendremos el factorial
            }
            if (i % 2 == 0) {//validar si el un numero par el sigmo es positivo, si no lo es negativo el signo
                signo = 1;
            }else{
                signo = -1;
            }
            cos = cos + (dividendo / divisor) * signo; //guardamos en la variable seno la serie de taylor osea la operacion
        }
        return cos;
    }
    
}

/*
int cont = 1;
        double potencia1 = 2;
        double potencia2 = 4;
        double y;
        double sumapositiva = 0.0;
        double sumanegativa = 0.0;
        
        Factorial fact = new Factorial();
        do{
            sumapositiva = sumapositiva-(Math.pow(valor, potencia1))/fact.calcula_factorial(potencia1); //serie tylor
            potencia1 +=4;
            sumanegativa = sumanegativa+(Math.pow(valor, potencia2))/fact.calcula_factorial(potencia2); //serie tylor
            potencia2 +=4;
            cont++;
        }while(cont < 4);{
        y = 1 + sumapositiva + sumanegativa;
        return y;
        
      }
*/

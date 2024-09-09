
package Paquete;

/**
 *
 * @author Carlos Mora
 */
public class Ex {
   
    public double ex (double x){
        int n = 10;
        double w = 1, y = 0, fac = 1;
        while(Math.abs(w) > 0.0000001){//math.abs calcula el valor absoluto
            for (int i = n; i < 0; i--) { //se ejucuta el for n veces
                fac *= i;
            }
            w = (Math.pow(x, n)/fac);
            y += w;
            fac = 1;
            n++;
        }
        return y;
    }
        
    
}
    
/*int n = 10; //precision
        double exponencial, dividendo, divisor;
        
        exponencial = 0; //inicializamos en 0 osea 1 
        
        for (int i = 0; i < n; i++) { //repite de i = 0 hasta valor de n para una mejor aproximacion
            //calculo de todo el for i
            dividendo = 1; //inicializar dividendo en 1 para que luego sea x^2 luego x^3 etc.
            for (int j = 0; j < i; j++) { // es parecido al seno solo cambia el 2 * i
                dividendo = dividendo * valor;
            }
            divisor = 1; //inicializar el divisor en 1 puesto que el factorial de 0 es 1
            for (int j = 1; j <= i; j++) {//es parecido al seno solo cambia el 2 * i
                divisor = divisor * j;//primero se multiplica 1x1, 1x2, 1X3 hasta que salga del for y tendremos el factorial
            }
            exponencial = exponencial + (dividendo / divisor); //guardamos en la variable seno la serie de taylor osea la operacion
        }
        return exponencial;*/
       /* int n = 10;
        int i = 0;
        int j;
        double factorial;
        double exponencial = 0;
        
        while(i <= n){
            j = 1;
            factorial = 1;
            while(j <= i){
                factorial = factorial * j;
                j = j + 1;
            }
            exponencial = exponencial + Math.pow(valor, i) / factorial;
            i = i + 1;
        }
        return exponencial;*/

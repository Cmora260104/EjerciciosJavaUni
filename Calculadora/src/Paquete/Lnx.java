
package Paquete;

/**
 *
 * @author Carlos Mora
 */
public class Lnx {
    public double LogN (double valor) {
	double resp = 0;
        int iteraciones = 10;

    for(int n = 1 ; n <= iteraciones ; n++){ //el ciclo termina hasta iteraciones
        resp += Math.pow(-1, n + 1) * Math.pow(valor, n) / n; //formula de logaritmo natural
    }
        return resp;
    }
    
}

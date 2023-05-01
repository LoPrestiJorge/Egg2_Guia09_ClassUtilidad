/*
Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
 */
package Services;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {
    
//1. Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
    public void iniciarlizarA(double[] arreglo){
        Random rand = new Random(); //clase random
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextDouble();
        }
    }

//2. Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.   
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

//3. Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
    }

//4. Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.  
    
    public void inicializarB (double[]a, double[] b){
        System.arraycopy(a, 0, b, 0, 10);  
        //Esto llena los primeros 10 numeros en las primeras posiciones del arreglo b.
        
        Arrays.fill(b, 10, b.length, 0.5); 
        //este comando llena los restantes espacios del arreglo b con un valor de 0,5.
    }
}

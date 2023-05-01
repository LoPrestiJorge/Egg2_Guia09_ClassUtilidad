/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
inicializar B, mostrar A y B.
 */
package guia09_actividad03_clasearrays_claseutilidad;

import Services.ArregloService;

public class Guia09_Actividad03_ClaseArrays_ClaseUtilidad {

    
    public static void main(String[] args) {
        ArregloService as = new ArregloService();
        double[] A = new double[50];
        double[] B= new double[20];
        
        as.iniciarlizarA(A);
        as.mostrar(A);
        as.ordenar(A);
        System.out.println("Arreglo A ordenado: ");
        as.mostrar(A);
        as.inicializarB(A, B);
        System.out.println("El arreglo B: ");
        as.mostrar(B);
    }
  
    
}

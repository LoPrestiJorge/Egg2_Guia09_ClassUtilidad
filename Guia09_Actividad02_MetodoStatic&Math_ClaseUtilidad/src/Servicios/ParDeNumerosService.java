/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;


public class ParDeNumerosService {
    private static Scanner entrada = new Scanner(System.in);
    ParDeNumeros n = new ParDeNumeros();
//a) Método mostrarValores que muestra cuáles son los dos números
//guardados. 
    
    public void mostrarValores(){
        System.out.println("Los valores guardados son: "+ n.getN1()+" "+n.getN2());
    }

//b) Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor.
    public void devolverMayor() {
        if (n.getN1() > n.getN2()) {
            System.out.println("El primer número es mayor al segundo.");
        } else {
            System.out.println("El segundo número es mayor al primero.");
        }
    }
    
//c) Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    
    public void calcularPotencia() {
        double resultado = 0;
        if (n.getN1() >= n.getN2()) {
            resultado = Math.pow(n.getN1(), n.getN2());

        } else {
            resultado = Math.pow(n.getN2(), n.getN1());
        }

        System.out.println("La potencia es: "+Math.round(resultado));
    }
    
//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
    public void CalcularRaiz() {
        if (n.getN1() <= n.getN2()) {
            System.out.println(Math.sqrt(Math.abs(n.getN1())));
        } else {
            System.out.println(Math.sqrt(Math.abs(n.getN2())));
        }
    }
    
}

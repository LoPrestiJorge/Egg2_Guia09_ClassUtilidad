/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_actividad01_claseutilidad;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Guia09_Actividad01_ClaseUtilidad {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearCadena();
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        System.out.println("Ingrese la letra para ver cuantas veces está repetido: ");
        cs.vecesRepetido(c1, entrada.nextLine()); 
        System.out.println("Ingrese otra frase para comparar con la primera: "); 
        cs.compararLongitud(c1, entrada.nextLine());//con esa entrada se ingresa como parámetro lo que escriba el usuario
                                                    //es otra forma de ingresar un parametro desde el main, pero no me gusta prefiero 
                                                    //definirlo dentro del parámetro.
        System.out.println("Ingrese otra frase o la misma para unir con la primera: ");
        cs.unirFrases(c1, entrada.nextLine());
        
        System.out.println("Ingrese una letra para cambiar");
        cs.reemplazar(c1, "a", entrada.nextLine()); 
        
        System.out.println("Ingrese un caracter para verificar si está en la frase: ");
        System.out.println(cs.contiene(c1, entrada.nextLine()));
    }
    
}

//cs.reemplazar(c1, entrada.next().charAt(0)); Asi se programa para que lea un char desde el teclado. 
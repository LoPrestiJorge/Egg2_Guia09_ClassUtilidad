/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_actividadextra02_juegoahorcado;

import Services.AhorcadoService;
import java.util.Scanner;

public class Guia09_ActividadExtra02_JuegoAhorcado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService as = new AhorcadoService();
        char salida = 'a';
        do {
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir del juego.");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    as.juego();
                    break;

                case 2:
                    System.out.println("¿Seguro quiere salir del juego? (seleccione S para confirmar)");
                    salida = entrada.next().charAt(0);
                    if (salida == 'S') {
                        System.out.println("Saliendo...");
                    }
                    break;
                default:
                    System.out.println("La opción ingresada no es válida. }");
            }
        } while (salida != 'S');     
    }    
}

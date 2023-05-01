/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
package guia09_actividad04_clasedate_claseutilidad;

import Servicios.FechaService;
import java.util.Date;
import java.util.Scanner;

public class Guia09_Actividad04_ClaseDate_ClaseUtilidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FechaService fs = new FechaService();      
        Date fechaNacimiento = fs.fechaNacimiento();
        Date fechaActual = fs.fechaActual();
        int diferencia = fs.diferencia(fechaNacimiento, fechaActual);
        System.out.println("La diferencia entre las dos fechas es: "+diferencia+" años.");       

    }
    
}

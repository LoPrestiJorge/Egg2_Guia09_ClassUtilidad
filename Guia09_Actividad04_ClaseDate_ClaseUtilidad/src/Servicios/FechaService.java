/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
package Servicios;

import java.util.Scanner;
import java.util.Date;

public class FechaService {
    private final Scanner entrada = new Scanner(System.in);
/*
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
*/

    public Date fechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Dia: ");
        int dia = entrada.nextInt();
        System.out.println("Mes: ");
        int mes = entrada.nextInt()-1;
        System.out.println("Año: ");
        int anio = entrada.nextInt()-1900; //asi resta la suma de 1900.
       
        return new Date(anio, mes, dia); //asi se retorna una fecha.
        //ACORDATE DE AGREGAR NEW CUANDO TE SALTE ERROR.
    }
    

//b) Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
//El método debe retornar el objeto Date.   
    public Date fechaActual(){
        return new Date();   //asi se retorna la fecha actual.
    }
    
//Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario)
    
    public int diferencia(Date fecha1, Date fecha2){
        //primero pasa las fechas a milisengundos desde la EPOCH y luego se realiza la resta.
        long diffInMillies = Math.abs(fecha2.getTime()- Math.abs(fecha1.getTime()));
        long diff = diffInMillies / (24*60*60*1000); //realiza la conversión de miliseg, seg, min, hora (creo).
        return  (int) (diff/365);
    }
}


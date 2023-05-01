/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;

public class PersonaServicio {
//a) Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    private final Scanner entrada = new Scanner(System.in);
    Persona p = new Persona();
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/yyyy): "); 
        String fechaString = entrada.nextLine();
        Date fechaNacimiento = parseFecha(fechaString);
        return new Persona(nombre, fechaNacimiento);      
    }
    
//b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual. 
    
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        long diffInMillies = Math.abs(fechaActual.getTime()- p.getFechaNacimiento().getTime());
        long diferencia = diffInMillies / (24*60*60*1000);
        return (int) (diferencia/365);
    }
    
//c) Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    
    public boolean menorQue(Persona persona, int edad) {
    int edadPersona = calcularEdad(persona);
    return edadPersona<edad;
    
}

//d) Método mostrarPersona que muestra la información de la persona
//deseada.
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fecha de nacimiento: "+p.getFechaNacimiento());
    }
  
    private Date parseFecha(String fechaString){
        String[] fecha = fechaString.split("/");
        int dia = Integer.parseInt(fecha[0]);   //parseInt trasforma el dato String en Int
        int mes = Integer.parseInt(fecha[1])-1;
        int anio = Integer.parseInt(fecha[2])-1900;
        return new Date(anio, mes, dia);
    }
}


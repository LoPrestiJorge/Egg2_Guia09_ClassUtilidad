/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_actividad05_clasedate_claseutilidad;

import Entidades.Persona;
import Servicios.PersonaServicio;


public class Guia09_Actividad05_ClaseDate_ClaseUtilidad {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio(); 
        
        Persona persona = ps.crearPersona();
        int edad = ps.calcularEdad(persona);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("¿Es menor a 18 años? "+ps.menorQue(persona, edad));
        ps.mostrarPersona(persona);
    } 
}

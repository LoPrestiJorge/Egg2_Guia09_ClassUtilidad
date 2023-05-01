/*
Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
 */
package guia09_actividad06_clasevectores_claseutilidad;

import Entidades.Curso;


public class Guia09_Actividad06_ClaseVectores_ClaseUtilidad {

    public static void main(String[] args) {
        Curso curso = Curso.crearCurso();
        System.out.println("El ingreso semanal del curso es: "+curso.calcularGananciaSemanal());
    }
    
}

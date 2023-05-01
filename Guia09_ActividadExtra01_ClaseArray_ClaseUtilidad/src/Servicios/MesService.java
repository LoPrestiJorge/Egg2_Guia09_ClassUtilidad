/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicios;

import Entidades.MesSecreto;
import java.util.Scanner;

public class MesService {
    private static Scanner entrada = new Scanner(System.in);
    
    public MesSecreto asignarMesSecreto(String[]meses){
        MesSecreto nuevoMesSecreto = new MesSecreto();
        nuevoMesSecreto.setMesSecreto(meses[(int)Math.floor(Math.random()*12+1)]); 
        //Math.floor redondea para abajo un double a int: Math.floor(3.14)=3.00                                                                                 
        return nuevoMesSecreto;
    }
    
    public void adivinarMes (MesSecreto mesSecreto){
        System.out.println("Adivine el mes secreto: ");
        String mes = entrada.nextLine();
        
        while(!mes.equalsIgnoreCase(mesSecreto.getMesSecreto())){
            System.out.println("No ha acertado, intentelo nuevamente: ");
            mes = entrada.nextLine();
        }
        System.out.println("¡Adivinaste el mes!");
    }
}

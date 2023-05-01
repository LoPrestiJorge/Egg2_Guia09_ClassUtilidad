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
package guia09_actividadextra01_clasearray_claseutilidad;

import Entidades.MesSecreto;
import Servicios.MesService;

public class Guia09_ActividadExtra01_ClaseArray_ClaseUtilidad {

    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
        "septiembre", "octubre", "noviembre", "diciembre"};
        
        MesService ms = new MesService();
        MesSecreto MesSecreto = ms.asignarMesSecreto(meses);
        ms.adivinarMes(MesSecreto);
        
    }
    
}

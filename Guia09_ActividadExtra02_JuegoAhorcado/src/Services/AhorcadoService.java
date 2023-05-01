/*
Definir los siguientes métodos en
AhorcadoService:
 */
package Services;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

Scanner entrada = new Scanner(System.in).useDelimiter("\n");
Ahorcado ahorcado = new Ahorcado();

//Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
  
    public void crearjuego(){
        System.out.println("Ingrese la palabra para que el otro adivine: ");
        String palabraABuscar = entrada.nextLine();
        char[] caracteres = new char [palabraABuscar.length()];
        
        for (int i = 0; i < palabraABuscar.length(); i++) {
           caracteres[i] = palabraABuscar.charAt(i);
        }
        
        ahorcado.setPalabraABuscar(caracteres);
      
        System.out.println("Ingrese la cantidad máxima de jugadas: ");
        ahorcado.setCantidadDeJugadas(entrada.nextInt());
        boolean finDeIntentos;
        boolean palabraEncontrada;
        
        do {
            System.out.println("Ingrese la palabra a buscar: ");
            char letra = entrada.next().charAt(0);
            encontradas(letra, ahorcado);
            finDeIntentos = ahorcado.getCantidadDeJugadas()> 0;
            palabraEncontrada = palabraEncontrada = ahorcado.getLetrasEncontradas() == ahorcado.getPalabraABuscar().length;
            
            if(palabraEncontrada){
                System.out.println("¡Ganaste! ¡Felicitaciones!");
                break;
            }else if(!finDeIntentos){
                System.out.println("Perdiste");
                break;
            }     
            
        } while (true);
        
    }

//Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length
    public int Longitud(String caracteres){
        return caracteres.length();
    }

//Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.   
    public boolean buscar(char letra, Ahorcado ahorcado){
        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraABuscar();

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                break;
            }
        }
        if(letraEncontrada){
            System.out.println("La letra pertenece a la palabra.");         
        }else{
            System.out.println("La letra ingresada es incorrecta.");
        }         
        return letraEncontrada;
    }
    
//Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(char letra, Ahorcado ahorcado){
        boolean letraEncontrada = buscar(letra, ahorcado);
        char [] palabra = ahorcado.getPalabraABuscar();
        if(letraEncontrada){
            for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
                if(letra == palabra[i]){
                    letraEncontrada = true;
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas()+1);
                }
            }
        }else{
            ahorcado.setCantidadDeJugadas(ahorcado.getCantidadDeJugadas()-1);
            intentos(ahorcado);
        }
        
        int faltantes = ahorcado.getPalabraABuscar().length- ahorcado.getLetrasEncontradas();
        System.out.println("Faltan "+ faltantes + " letras.");
        return letraEncontrada;       
        
    }
    
//Método intentos(): para mostrar cuántas oportunidades le queda al
//jugador.
    public void intentos(Ahorcado ahorcado){
        System.out.println("Te quedan "+ ahorcado.getCantidadDeJugadas()+ " jugadas.");
    }
    
    
//Método juego(): el método juego se encargará de llamar todos los
//métodos previamente mencionados e informará cuando el usuario
//descubra toda la palabra o se quede sin intentos. Este método se
//llamará en el main.
    public void juego() {
        crearjuego();
    }
}

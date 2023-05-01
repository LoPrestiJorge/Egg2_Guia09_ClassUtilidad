/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    private static Scanner entrada = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
//0. Método crearCadena para que el usuario ingrese la frase.  
    public Cadena crearCadena(){
        System.out.println("Ingrese la frase: ");
        c1.setFrase(entrada.nextLine());
        return c1;
    }
    
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    public void mostrarVocales(Cadena c1){
        int cantVocales = 0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if((c1.getFrase().charAt(i)=='a')|| (c1.getFrase().charAt(i)=='A')||
                (c1.getFrase().charAt(i)=='e')|| (c1.getFrase().charAt(i)=='E')||
                (c1.getFrase().charAt(i)=='i')|| (c1.getFrase().charAt(i)=='I')||
               (c1.getFrase().charAt(i)=='o')|| (c1.getFrase().charAt(i)=='O')||
               (c1.getFrase().charAt(i)=='u')||(c1.getFrase().charAt(i)=='U')){
               
               //c1.getFrase().substring(i, c1.getFrase()).equals("a")||
               //c1.getFrase().substring(i, c1.getFrase()).equals("e")||
               //c1.getFrase().substring(i, c1.getFrase()).equals("i")||
               //c1.getFrase().substring(i, c1.getFrase()).equals("o")||
               //c1.getFrase().substring(i, c1.getFrase()).equals("u")){
                cantVocales++;    
            }
        }
        System.out.println("La cantidad de vocales de la frase: '" + c1.getFrase()+"' son: "+cantVocales);
    }
    
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalbasac". 
   public void invertirFrase(Cadena c1) {
        for (int i = c1.getFrase().length(); i > 0 ; i--) {
            System.out.print(c1.getFrase().substring(i-1, i));
            
            //otra alternativa:
            //for (int i = 0; i > c1.getFrase().length() ; i++) {
            //System.out.print(frase.toCharArray()[c1.getLongitud()-i-1]);
        }
        System.out.println("");
    }
 
//c) y d) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces
    public void vecesRepetido(Cadena c1, String letra) {
        int cantLetra = 0;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
            if (c1.getFrase().charAt(i)== letra.charAt(0)) {
                cantLetra++;
            }
        }
        if(cantLetra > 0){
            System.out.println("La cantidad de repeticiones del caracter '"+letra+
                    "' es: "+cantLetra);          
        }else {
            System.out.println("El carácter ingresado no se encontró en la frase.");
        }
    }
    
//e) Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
    public void compararLongitud(Cadena c1, String frase2){
        
        if(c1.getFrase().length() > frase2.length()){
            System.out.println("La primer frase es mas larga que la segunda.");
                        
        }else if(c1.getLongitud() < frase2.length()){
            System.out.println("La segunda frase es más larga que la primera.");
        }else{
            System.out.println("Las frases tienen una misma longitud.");
        }      
    }
    
//f) Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
    public void unirFrases(Cadena c1, String frase3){
        System.out.println("La frase concatenada queda así: "+c1.getFrase().concat("-"+frase3));
        //System.out.println(c1.getFrase() + " " + frase3);
    }
       
//g) Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.   
    public void reemplazar(Cadena c1, String letraOriginal, String letraNueva){
        System.out.println(c1.getFrase().replace(letraOriginal.charAt(0), letraNueva.charAt(0))); //asi se reemplaza.
    }
//Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    public boolean contiene(Cadena c1, String letra){
        return c1.getFrase().contains(letra); 
      }
}






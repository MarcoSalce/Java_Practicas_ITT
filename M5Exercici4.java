/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccion;

import java.util.Scanner;

/**
 *
 * @author jmarc
 */
public class M5Exercici4 {
    public static void main(String Args[]){
        /*
        Enunciado:
        Has de modificar el programa anterior per afegir una 
        nova funcionalitat: establir un número màxim de 5 intents.
        Si l’usuari encerta el número escollit pel programa abans 
        d'aquests 5 intents, el programa mostra el següent missatge per 
        pantalla: “Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.
        Si no encerta el número abans de 5 intents, el programa mostra 
        per pentalla: "Has utilitzat massa intents! El número és X ".
        */
        

    // Declaracion de variables
        int x; //Numero que entrara el usuario
        int y = (int)Math.ceil(Math.random()*10+1); //Obtencion de numero aleatorio de 1 a 10
        int conta = 5; //Numero de intentos que se han delimitado en el enunciado

    // Se crea el objeto donde se almacena lo que el usuario ingrese 
        Scanner Datos = new Scanner(System.in);
    
    // Primer mensaje del juego       
        System.out.println("Concurso: Acierta el número aleatorio " + " Recuerda: Tienes 5 intentos.");
        
    // Realización del ciclo do-while
        do { // Inicio del bucle
            
            // Mensaje donde te sale el numero de intentos, comienza en 5
            System.out.println("Número de intentos: " + conta);
            
            //  Numero que ingresa el usuario, y se almacena en el scanner Datos
            System.out.print("Introduce el número que creas posible: ");
            x = Datos.nextInt();
            
        // La condicion dentro del bucle
            // Si es x es diferente de y, te saldra el mensaje de error y los intentos que te queda
        if (x != y) {
           System.out.println("No es el numero que buscas. Tienes " + (conta-1) + " intentos.");
        
        }else {
            // Cuando x es equivalente a y, te saldra el mensaje de concidencia y en cuantos intentos lo has conseguido
            System.out.print("Enhorabuena el número era " + y + " y, has necesitado " + (5 - (conta-1)) +" intentos.");
      }
      conta--; //Decremento del numero para que disminuya el conta
        
        // Aqui se acaba el bucle, cuando se cumpla las condiciones
        // Que x es diferente a y. Y conta es mayor a 0
        } while (x != y && conta > 0);
            // Cuando conta es equivalente a 0, se imprime el mensaje que has perdido
            if (conta == 0) {
            System.out.println("Has utilizado muchos intentos! El número es " + y);
    }
  }
}

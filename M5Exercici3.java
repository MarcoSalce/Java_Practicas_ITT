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
public class M5Exercici3 {
    public static void main(String Args []){
        /*
        Enunciado:
        Aquesta línia de codi: Math.ceil((Math.random() * 10));  
        Retorna un número entre el 0 i el 10 de forma aleatòria.
        L’exercici consisteix a què l’usuari ha d'endevinar el número 
        escollit aleatòriament pel programa.
        El programa, demana números a l’usuari fins que 
        aquest encerti el número aleatori generat pel programa.
        Un cop l’usuari ha endevinat el número, 
        es mostrarà per pantalla el següent missatge: “Enhorabona, el número era X”
        
        El usuario ha de adivinar el numero aleatorio dado por el programa
        */
        
        //Variables
          
        int x; //Numero que entrara el usuario
        int y = (int)Math.ceil(Math.random()*10+1); //Obtencion de numero aleatorio de 1 a 10
        
        //Se delimita el Scanner para que la recopilacion de datos
        Scanner datos = new Scanner(System.in);
        // Mensaje de entrada para el concurso
        System.out.println("Concurso: Acierta el número aleatorio");

        
        // Realización del ciclo do-while
        do { 
            System.out.println("Ingresa un número del 1 al 10: "); // Aqui el usuario entra los datos 
            x = datos.nextInt(); // x es la variable donde el usuario entra el numero
        
        // Dentro del do se hace la condicion
        // Si el numero x es equivalente a y, ganas el concurso
          if (x == y) {
            System.out.println("Enhorabuena el numero era: " + y);
          } else { //Se cierra el bucle hasta que se cumpla la condicion
          }
          // Si es x es diferente a y entonces el bucle se mantendra de manera infinita
          } while (x != y);
        }
    }
    

        
       
        
        
        
        
    
    


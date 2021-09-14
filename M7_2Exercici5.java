
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmarc
 */
public class M7_2Exercici5 {
    
    /*
    Enunciado:
    L’usuari introdueix un nombre per teclat i el programa 
    imprimeix per pantalla si el nombre és primer o no
    */

        public static boolean metodoprim(int nume){
            int contador = 2;
            boolean respuesta = true;
            
            while(respuesta == true && contador != nume){
                if (nume%contador == 0){
                    respuesta = false;
                }
            }
       contador ++;        
            return respuesta;
    }
        
public static void main(String Args []){
        
        // Variables 
        int nume1;
                
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número");
        nume1 = datos.nextInt();
        boolean respuesta = metodoprim(nume1);
        if(respuesta){
            System.out.println("Es número primo");
        } else {
            System.out.println("No es número primo");
        }
    }
}



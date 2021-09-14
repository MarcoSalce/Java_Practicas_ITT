/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmarc
 */
public class M5Exercici2 {
    public static void main(String Args[]){
        /*
        Argumento:
        El programa demana dos números enters i llavors calcula 
        la suma dels valors compresos entre els dos números, inclosos. 
        Exemple: 4 i 6  --> resultat = 4 + 5 + 6 = 15
        */
        
        // Variables
        int x, y;
        int opera =0; // Variable para determinar la operacion
        
        
        // Scanner para pedir los datos de intervalo
        Scanner datos = new Scanner (System.in);
        System.out.println("Escribe un valor para el primer intervalo");
        x = datos.nextInt();
        System.out.println("Escribe un valor para el segundo intervalo");
        y = datos.nextInt();
        
        // Se almacena en suma
        ArrayList<Integer> suma = new ArrayList<>();
        for (int i = x; i <= y; i++){ // El for es un bucle o ciclo 
            // se lee donde i es igual x. i es menor igual a y. Se incrementa i
            suma.add(i); //Se adapta a i
            opera += i; //+= operador acumulativo  
        }
        System.out.println("La suma de los valores del intervalo es igual a " + opera);
    }      
}           


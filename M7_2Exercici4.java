
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
public class M7_2Exercici4 {
    
    public static void main(String [] args){
        
        /*
        Enunciado:
        Realitzar un programa on l’usuari introdueix un número 
        i el programa li retorna el factorial del número introduit
        
        Factorial de un numero
        n! = 1 x 2 x 3 x 4 x 5 x ... x (n-1) x n.
        */
        
        //Variables
        
        int facto = 1;
        int nume;
        
        // Metodo Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Conozcamos el factorial de un número");
        System.out.println("Ingresa un número: ");
        nume = datos.nextInt();
        
        // Logica for
        for (int i = nume; i>0; i--){
            facto = facto*i;
        }
        // Se imrpime el resultado
        System.out.println("El factorial del número es: " + facto);
    }
}

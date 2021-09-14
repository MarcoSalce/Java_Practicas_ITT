
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
public class M7_2Exercici3 {
    public static void main(String Args[]){
        
        /*
        Enunciado:
        Fes un programa que mostri el següent per pantalla:

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        La línea amb més “*” vindrà donada per un número 
        que l’usuari introduirà per consola.
        Condició: En tot el codi del programa només hi pot haver-hi dos *
        També, a poder ser, no utilitzis 
        cap mètode com repeat() o substring() de la classe String
        */
        
        // Variables
        int nume;
        
        // Metodo Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número");
        nume = datos.nextInt();
        
        //Logica para crear la figura
        // Es una combinacion de los dos anteriores ejercicios
        
        // Primera mitad de la figura
        // Comienza en 0 y va en funcion del numero pedido al usuario
        for(int i=0; i<=nume; i++) {
            for(int j=0; j<=i; j++) {
                // Imprime el simbolo que se establece en print
                System.out.print("*");
        }
        System.out.println();
        }
        
        // Segunda mitad de la imagen
        // Comienza en 1 y va de arriba hacia abajo
        for(int j=1; j<=nume; j++) {
            for(int i=nume; i>=j; i--) {
                System.out.print("*");
        }
        System.out.println();
        }
    }
}
    
    
    


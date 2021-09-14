
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
public class M7_2Exercici2 {
    
    public static void main(String Args[]){
        /*
        Enunciado:
        Fes un programa que mostri el següent per pantalla:
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
        El nombre de línies formades per “*” vindrà 
        donat per un número que l’usuari introduirà per consola.
        Condició: En tot el codi del programa només hi pot haver un *
        També, a poder ser, no utilitzis cap 
        mètode com repeat() o substring() de la classe String
        */
        
        // Variables
        int nume;
        
        // Metodo Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número");
        nume = datos.nextInt();
        
        // Logica del for
        for(int i=1; i<=nume; i++) {
            for(int j=nume; j>=i; j--) {
                System.out.print("*");
        }
        System.out.println();
        }
    }
}   
        

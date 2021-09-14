/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch1;

import java.util.Scanner;

/**
 *
 * @author jmarc
 */
public class M4Exercici2 {
    public static void main(String Args []){
        /*
        Aquest programa li demana l’edat a l’usuari, en funció d’aquesta, 
        mostrarem un dels següents missatges per pantalla:
        Si té 5 anys o menys: preescolar
        i té entre 6 i 11 anys: primària
        Si té entre 12 i 15: ESO
        Si té entre 16 i 17: Batxillerat
        Si és major d'edat: FP o Universitat 
        */
        
        int edad;
        Scanner curso = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        edad = curso.nextInt();
        
        if(edad<=5){
            System.out.println("Eres de preescolar");
        } else if(edad>=6 && edad<=11){
            System.out.println("Eres de primaria");
        } else if(edad==12 && edad<=15){
            System.out.println("Eres de ESO");
        } else if(edad==16 && edad<=17){
            System.out.println("Eres de Bachillerato");
        } else if(edad>=18){
            System.out.println("Eres FP o Universitario");
        }     
    }
}

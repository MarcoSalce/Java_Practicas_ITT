
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
public class M7_1Exercici7 {
    
    public static void main(String Args[]){
        
        /*
        Enunciado:
        Fer un programa on l’usuari introdueix per pantalla un caràcter i un número. 
        El programa imprimeix per pantalla un quadrat amb la mida i 
        el caràcter introduïts per l’usuari.
        Exemple:
        % % % % %
        % % % % %
        % % % % %
        % % % % %
        % % % % %
        */
        
        int nume;
        String carac;
        
        Scanner datos = new Scanner(System.in);
        
        //Lo que el usuario introduce
        System.out.println("Introduce un número");
        nume = datos.nextInt();
        
        System.out.println("Introduce un caracter");
        carac = datos.next();
        
        // Interaccion
        
        for(int i=0; i < nume; i++){
            for(int c=0; c < nume; c++){ 
            System.out.print(carac);
        }
        System.out.print("\n");
        }
        
        //Println salta la linea
        //Print no da un salto de linea
    }
}

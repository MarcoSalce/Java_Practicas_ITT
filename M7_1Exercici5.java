/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmarc
 */
public class M7_1Exercici5 {
    public static void main(String Args[]){
        /*
        Enunciado
        Mostra per pantalla els nombres parells compresos 
        entre el 100 i el 0 en ordre descendent.
        */
       
        //Variables
        int i = 100; //El index comienza por el 100
        
        //for itinerador que se imprime parejas
        // Interaccion que tiene que recorrer
        for(i=98; i>0; i-=2){ //i -= 2 equivale a i = i-2
            System.out.println(i);       
        }      
    }
}

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
public class M5Exercici5 {
    

    public static void main(String Args[]){
        /*
        Has de modificar el programa de les beques (ara el programa només ha de poder donar 5 beques).
        El programa anirà demanant les dades dels alumnes fins que es donin aquestes 5 beques. 
        Un cop el programa hagi assignat les 5 beques 
        s’ha de mostrar per pantalla els noms dels 5 alumnes que tenen beca.
        */
        
        int edat;
        String nom;
        boolean titol, atur, beca;
        
        ArrayList <String> becados = new ArrayList();
        Scanner becas = new Scanner(System.in);
        
        // Un bucle while en el inicio de las preguntas donde se cerrara cuando 
        // la longitud sea menor a 5
        while (becados.size()<5){
        
        //Preguntas en bucle    
        System.out.println("Como te llamas?");
        nom = becas.next();
        System.out.println("Que edad tienes?");
        edat = becas.nextInt();
        System.out.println("Tienes algun titulo universitario? (responder con si o no)");
        String uni = becas.next();
        titol = (uni.toLowerCase().equals("si")) ? true : false;
        System.out.println("Estas en el paro?");
        String paro = becas.next();
        atur = (paro.toLowerCase().equals("si")) ? true : false;

        //La logica para saber 
        if((edat >= 18 && titol == true) || atur == true){
            beca = true;
            becados.add(nom);
            System.out.println("Tienes una beca");

        }else {
            beca = false;
            System.out.println("No puedes participar");
            System.out.println("No estas en la lista de becados");
   
        }
        
   } 
        //Se imprime la lista de becados al final    
        System.out.println("Esta es la lista de becados: " + becados);
}
}
        



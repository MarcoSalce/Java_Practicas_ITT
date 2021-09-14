
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
public class M7_1Exercici8 {
    
    public static Double conversor(double gradoC){
        // Es lo que se pide desde fuera
        double gradoF = (gradoC * 1.8)+32;
        return gradoF;
        
    }
    
    //Llamar al metodo
    
    public static void main(String Args[]){
        /*
        Enunciado:
        Crea un programa on l’usuari introdueixi una temperatura en ºC i 
        es mostri per pantalla la conversió en ºFahrenheit
        */
        
        //Variables
        double gradoC;
        double gradoF;
        
        // Objeto
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero en grados centigrados");
        gradoC = datos.nextDouble();
        
        
        //Llamando la funcion asignando el valor que se ha declarado
        gradoF = conversor(gradoC);

        System.out.println("Esto equivale a " + gradoF + " grados Fahrenheit");
    }
}

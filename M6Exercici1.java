
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
public class M6Exercici1 {
   
    public static void main(String Args[]){
        
        /*
        Calculadora arcaica. El programa demana a l’usuari que introdueixi dos números 
        i l’operació que desitja realitzar. 
        Cada operació (suma, resta, multiplicació, divisió i mòdul) 
        estarà programada en una funció diferent.
        */
        
        //Variables
        
        String opera;
        int nume1, nume2; 
        int resuSuma, resuResta, resuMulti; 
        float resuDivi, resuModul;
                
        //Hacer el scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un valor");
        nume1 = datos.nextInt();
        System.out.println("Introduce otro valor");
        nume2 = datos.nextInt();
        System.out.println("Que operación quieres hacer");
        opera = datos.next();
        
        
        if(opera.equals("+")){
            resuSuma = suma(nume1, nume2); //Inicializar el metodo dentro del if
            System.out.println("La suma es: " + resuSuma);
        }else if (opera.equals("-")){
            resuResta = resta(nume1, nume2); //Inicializar el metodo dentro del if
            System.out.println("La resta es: " + resuResta);
        }else if (opera.equals("*")){
            resuMulti = multi(nume1, nume2); //Inicializar el metodo dentro del if
            System.out.println("La multiplicación es: " + resuMulti);
        }else if (opera.equals("/")){
            resuDivi = (float)divi(nume1, nume2); //Inicializar el metodo dentro del if
            System.out.println("La división es: " + resuDivi);
        }else if (opera.equals("%")){
            resuModul = (float)modul(nume1, nume2); //Inicializar el metodo dentro del if
            System.out.println("El modulo es: " + resuModul);
        }
    }        

    public static int suma(int x, int y){ //Se hace la equivalencia
        int z;
        z = x + y;
        return z;
    }
    public static int resta(int x, int y){
        int z;
        z = x - y;
        return z;
    }
        public static int multi(int x, int y){
        int z;
        z = x * y;
        return z;
    }
        public static float divi(int x, int y){
        float z;
        z = x / y;
        return (float)z;
    }
        public static float modul(int x, int y){
        float z;
        z = x % y;
        return (float)z;
    }
}

        
        

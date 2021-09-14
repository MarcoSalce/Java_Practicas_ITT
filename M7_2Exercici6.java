
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
public class M7_2Exercici6 {
    
    public static void main(String Args []){
        
        /*
        Enunciado:
        L’usuari ha d’introduir números fins que introdueixi un nombre primer. 
        En el moment que l’usuari introdueixi un nombre primer, 
        el programa ha de treure per pantalla el següent 
        missatge: Exacte, el número “x” és primer!
        */
        
        //Variables
        int numUsua;
        boolean respuesta = true;
        
        Scanner datos = new Scanner(System.in);
        

        do{
            if(respuesta==false){
                System.out.println("Sigue intentandolo");
            }
        System.out.println("Introduce numeros: ");
        numUsua = datos.nextInt();
        respuesta = checkPrime(numUsua);
        } while (respuesta == false);
        System.out.println("Este número es primo");
    }

    public static boolean checkPrime(int numUsua){
        int contador = 2;
        boolean varPrimer = true;
                
        while (varPrimer && contador != numUsua){
            if(numUsua%contador==0){
                varPrimer = false;
            }
            contador++;
        }
        return varPrimer;  
    }
}

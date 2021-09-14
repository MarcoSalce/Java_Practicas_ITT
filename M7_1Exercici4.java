
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
public class M7_1Exercici4 {
    
    public static void main(String Args[]){
        /*
        L’usuari ha d’introduir dos números, 
        el programa retornarà “Un dels dos números és negatiu”,
        només si un dels dos números és negatiu.
        */
        
        //Variables
        int num1;
        int num2;
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = datos.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = datos.nextInt();
        
        // El xor cuando se alguno de las dos condiciones
        if((num1<0)^(num2<0)){
            System.out.println("Uno de los dos numeros es negativo");
        } else {
            System.out.println("Ninguno de los dos numeros es negativo");
        }       
    }
}

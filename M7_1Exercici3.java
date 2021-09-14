
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
public class M7_1Exercici3 {
    
    public static void main(String Args[]){
        
        /*
        L’usuari ha d'introduir un número 
        i el programa ha de mostrar per pantalla si el número és parell o imparell.
        */
        
        //Variables
        int num;
        String respuesta;
        
        //Se declara el tipo
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = datos.nextInt();
        
        // La condicion de respuesta
        // Si el modulo % entre dos es equivalente a 0, entonces es Par, si no es impar
        respuesta = (num%2 == 0)? "El número es par": "El número es impar";
        System.out.println(respuesta);
        
        
    } 
    
}

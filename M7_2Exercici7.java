
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
public class M7_2Exercici7 {
    public static void main(String Args[]){
        /*
        Enunciado:
        Crea un programa on l’usuari introdueixi un any 
        i el programa digui si l’any és de traspàs o no.
        */
        
        //Variables
        int any;
        String respuesta = "";

        Scanner datos = new Scanner(System.in);
        System.out.println("Dime un año");
        any = datos.nextInt();
        
        if(any%400==0 || (any%4==0 && any%100!=0)){
            respuesta = "Es bisiesto";
        } else {
            respuesta = "No es bisiesto";
        }
        System.out.println(respuesta);
    }
}



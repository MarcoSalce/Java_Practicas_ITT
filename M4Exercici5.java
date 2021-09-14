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
public class M4Exercici5 {
    public static void main(String Args[]){
        /*
        Fer un programa que demani dos numeros y un operador
        Al final, el programa ha de imprimir per pantalla el resultado de fer
        la operacion que contingui la variable operador
        */
        int a;
        int b;
        String operador;
            
        Scanner operaciones = new Scanner(System.in);
        System.out.println("Indica un numero entero para A");
        a = Integer.parseInt(operaciones.nextLine());
        
        System.out.println("Indica un numero entero para B");
        b = Integer.parseInt(operaciones.nextLine()); //IMPORTANTE: El parseInt es para pasar de String a Int
        
        System.out.println("Indica un simbolo operador + - x /");
        operador = operaciones.nextLine();
        
        if(operador.equals("+")){ //IMPORTANTE: El equals sirve para dar valor de equivalencia
            System.out.println("La suma es " + (a+b));
        } else if(operador.equals("-")){
            System.out.println("La resta es " + (a-b));
        } else if(operador.equals("*")){
            System.out.println("La multiplicacion es " + (a*b));
        } else if(operador.equals("/")){
            System.out.println("La division es " + ((float)a/b));
        }
    }    
}
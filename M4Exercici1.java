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
public class M4Exercici1 {
    public static void main(String Args[]){
        Scanner datos = new Scanner(System.in);
        String nom, cognom; 
        int edat;
        
        System.out.println("Como te llamas");
        nom = datos.nextLine();
        
        System.out.println("Cúal es tu apellido");
        cognom = datos.nextLine();
        
        System.out.println("Que edad tienes");
        edat = datos.nextInt();
        
        // realizamos el if
        
        if(edat >= 18){
            System.out.println(nom + " " + cognom + " es mayor de edad.");
        } else {
            System.out.println(nom + " " + cognom + " es menor de edad.");
        } 
    }
}

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
public class M4Exercici3 {
    public static void main(String Args[]){
        int edat;
        boolean titol, atur, beca;
        Scanner becas = new Scanner(System.in);
        
        System.out.println("Que edad tienes?");
        edat = becas.nextInt();
        
        System.out.println("Tienes algun titulo universitario? (responder con si o no");
        String uni = becas.next();
        
        titol = (uni.toLowerCase().equals("si")) ? true : false;
        
        System.out.println("Estas en el paro?");
        String paro = becas.next();
        
        atur = (paro.toLowerCase().equals("si")) ? true : false;
        
        if((edat >= 18 && titol == true) || atur == true){
            beca = true;
            System.out.println("Tienes una beca");
        }else {
            beca = false;
            System.out.println("No puedes participar");
        }  
    }        
}

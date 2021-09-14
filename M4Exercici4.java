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
public class M4Exercici4 {
    public static void main(String Args[]){
        // Indicar las variables y el scanner
        
        int numDies = 0;
        int numMes = 0;
        String nomMes = "";
        Scanner calendario = new Scanner(System.in);
        
        System.out.println("Indica un numero de mes");
        numMes = calendario.nextInt();
        
        //Switch
        
        switch(numMes){
            case 1:
                numDies = 31;
                nomMes = "Enero";
            break;
            case 2:
                numDies = 29;
                nomMes = "Febrero";
            break;
            case 3:
                numDies = 31;
                nomMes = "Marzo";
            break;
            case 4:
                numDies = 30;
                nomMes = "Abril";
            break;
            case 5:
                numDies = 31;
                nomMes = "Mayo";
            break;
            case 6:
                numDies = 30;
                nomMes = "Junio";
            break;
            case 7:
                numDies = 31;
                nomMes = "Julio";
            break;
            case 8:
                numDies = 30;
                nomMes = "Agosto";
            break;
            case 9:
                numDies = 30;
                nomMes = "Septiembre";
            break;
            case 10:
                numDies = 30;
                nomMes = "Octubre";
            break;
            case 11:
                numDies = 31;
                nomMes = "Noviembre";
            break;
            case 12:
                numDies = 30;
                nomMes = "Diciembre";
            break;
            default:
                System.out.println("Escoge un mes del año");
        }
        if(numMes > 0 && numMes < 13){
            System.out.println("El mes de " + nomMes + " tiene " + numDies + " dias.");
        }
    }            
}

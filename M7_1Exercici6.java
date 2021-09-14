
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
public class M7_1Exercici6 {
    
    public static void main(String Args[]){
        
        /*
        Enunciado:
        Taula de multiplicar. L’usuari introduirà un número per pantalla 
        i el programa li mostrarà la taula de multiplicar d’aquell número (del 1 al 10).
        Exemple:
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 10 = 20
        */
        
        //Variables
        int nume1;
        int i=1;
        //Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        nume1 = datos.nextInt();
        
        //Manera sofisticada de hacerlo
        for(i=1;i<11;i++){
            System.out.println(i + "x" + nume1 + "=" + (i*nume1));
        
        /*
        Manera de hacerlo: Programador junior java
        System.out.println("La tabla de multiplicar es: ");
        System.out.println(nume1 + "x1: " +nume1*1);
        System.out.println(nume1 + "x2: " +nume1*2);
        System.out.println(nume1 + "x3: " +nume1*3);
        System.out.println(nume1 + "x4: " +nume1*4);
        System.out.println(nume1 + "x5: " +nume1*5);
        System.out.println(nume1 + "x6: " +nume1*6);
        System.out.println(nume1 + "x7: " +nume1*7);
        System.out.println(nume1 + "x8: " +nume1*8);
        System.out.println(nume1 + "x9: " +nume1*9);
        System.out.println(nume1 + "x10: " +nume1*10);
        */
        }
    } 
}

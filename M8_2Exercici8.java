
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
public class M8_2Exercici8 {
    public static void main(String Args[]){
        /*
        Enunciado:
        L’usuari introdueix un nombre per teclat 
        i el programa li ha de mostrar la successió de Fibonacci.
        
        Exemple:
        Si l’usuari introdueix el 10 el 
        resultat ha de ser:0,1,1,2,3,5,8,13,21,34
        */
        
        //Variables
        int nume =0;
        int anterior =0;
        int resultado;
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa un número");
        resultado = datos.nextInt();
        
        for(int i = 0; i<resultado; i++){
            if(i==0){
                System.out.print(nume);
                anterior =1;
            } else {
                nume = nume + anterior;
                System.out.print(nume);
                anterior = nume - anterior; //Numero acumulado menos la operacion que vamos a hacer
            }
            if(i!=resultado -1){
                System.out.print(",");
            }
        }
    }
}

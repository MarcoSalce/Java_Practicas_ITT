
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
public class M7_2Exercici1 {
    public static void main(String Args[]){
        /*
        Enunciado:
        Fes un programa que mostri el següent per pantalla:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        El nombre de línies formades per “*” vindrà donat per un número 
        que l’usuari introduirà per consola.
        Condició: En tot el codi del programa només hi pot haver un *
        També, a poder ser, no utilitzis cap mètode com repeat() o substring() 
        de la classe String
        */
        
        // Variables 
        int nume1;
        
        //Funcion de Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una altura para crear una imagen: ");
        nume1 = datos.nextInt();
        //Llamar al metodo
        // Llamarle a la variable
        String respuesta = altura(nume1);
        System.out.println("He aqui tu imagen");
        System.out.println(respuesta);
        }   

    public static String altura(int nume1){
 
        String respuesta = "";
        int i, j;
        final String carac = "*";
        
        for(i = 0; i < nume1; i++){
        // Este for para las completar las lineas
            for(j=0; j<i; j++){
                respuesta = respuesta + carac;
        }
        respuesta = respuesta + "\n";
        // \n es nueva linea
        }
        return respuesta;
    }
}

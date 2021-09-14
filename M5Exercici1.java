/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmarc
 */
public class M5Exercici1 {
    public static void main(String Args[]){
        /*
        El programa demana quantes paraules vol introduir l'usuari. Aquest, introdueix 
        el número i llavors apareix el següent missatge: "Introdueix la paraula".
        Aquest missatge es mostra tantes vegades com número de paraules 
        ha dit l'usuari que volia introduir. Les paraules es guarden en un arrayList 
        i un cop han sigut totes introduïdes, es mostren per pantalla.
        
        Esquema
        Introducir cinco palabras = String
        Si se introduce un string se usa el Scanner mediante el nextline
        Luego se introducira en una lista o en un Array o Arraylist
        Y al final aplicar la interaccion que puede ser
        for, while, do while
        Como no sabemos cuantas palabras introducira se ha de ver      
        */
               
        // Variables
        int nume;
        int i;
        
        // Se pide al usuario que ingrese la cantidad con Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Cantidad de palabras que desea introducir");
        nume = datos.nextInt();
        
        // Se introduce el ArrayList para almacenar las palabras
        ArrayList<String> palabra = new ArrayList<String>();
        
        // Se hace el for para crear un bucle
        for (i=0; i<nume; i++){ 
        // i es igual a cero. Cuando la variable nume es menor a i. Se incrementa i
            System.out.println("Introduzca la palabra"); 
            //El mensaje del bucle hasta que se cumpla que i<nume
            palabra.add(datos.next()); 
            //Se adaptara la cantidad de palabras que se haya pedido en datos
            // Por eso esta datos.next esta dentro del add
        }
        // Para mirar el listado final de palabras que se ha introducido
        System.out.println("Las palabras que ha introducido en lista");
        System.out.println(palabra); //Se impribme el ArrayList
    }
}

/*
** Esto es una locura que he curioseado y ha salido bien, pero es demasiado código
para lo que piden en el enunciado **

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmarc

public class M5PracticaTeorica2 {
    public static String Dat[]; // Creacion de metodos 
    public static void main(String args[]){ //Aqui esta contenido el ArrayList
        Scanner Datos = new Scanner(System.in);
        int limite; //Variables
        System.out.println("Cantidad de palabras que desea introducir"); 
        limite = Datos.nextInt(); //Limite es igual a lo que se tiene en Datos
        Dat = new String[limite]; //Creacion de objeto para almacenar dentro
        ArrayList listas = new ArrayList();
        
        // Rellenar el ArrayList
        ElementosAlmacen(Dat, listas, Datos);
        
        // Mostrar elementos de ArrayList
        System.out.println(""); //Se imprime una linea en blanco para que se vea mejor
        System.out.println("Elementos de la lista");
        
        MostrarElementos(listas); //Se imprime la lista que se ha rellenado
        System.out.println(""); //Se imprime una linea en blanco para que se vea mejor 
             
    }
    public static void ElementosAlmacen(String Array[], ArrayList list, Scanner sc){ 
        //Creacion de metodos: Se almacena los elementos, el scanner que no esta dentro del metodo se declara
        for (int i=0; i<Array.length; i++){ //Creacion de bucle, length es el tamaño
            // El nucle parara cuando el array sea menor al tamaño que se ha puesto
            System.out.println("Ingrese la palabra ["+i+"] --> "); //i es donde se almacena
            Array[i] = sc.next(); //Se alamacena primero aqui
            list.add(Array[i]); // Luego se almacena dentro de listas
        }
    }
    
    //Metodo para mostrar los elementos del ArraysList
    public static void MostrarElementos(ArrayList list){
        list.forEach((lista)->{
            System.out.println(lista);
    });
    }
}
*/
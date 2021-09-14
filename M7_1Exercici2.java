
import java.util.ArrayList;
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
public class M7_1Exercici2 {
    
    
    public static void main(String Args[]){
        
        /*
        Un professor vol calcular les mitges de les notes de tota la classe. 
        Crea una aplicació on l'usuari introduirà un número per pantalla 
        (el número correspon al número de notes que vol introduir) i el programa 
        li demanarà que introdueixi les notes de tots els alumnes.
        Un cop les notes han sigut introduides, el programa retorna el següent:
        Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. 
        Els alumnes haurien de preguntar els seus dubtes i treballar més".
        Si la nota és inferior a 7: "La nota mitjana de la classe és bona, 
        però els alumnes haurien de millorar el treball personal".
        Per la resta de casos, el missatge ha de ser: "Enhorabona! 
        La nota mitjana de la classe es correspon amb l'esforç realitzat".
        *Les notes han d'estar compreses entre 0 i 10.
        */
        
        //Variables
        int numNotas;
        int i;
        double prom=0;
        double notaAlumno;
        double suma=0;
        
        //Scanner
        Scanner datos = new Scanner(System.in);
        System.out.println("Cuantas notas quieres introducir");
        numNotas = datos.nextInt();

                
        // ArrayList
        ArrayList<Double> notas = new ArrayList<Double>();
 
        //Size se usa en ArrayList
        // Se pone nota porque es el numero que el usuario introduce
        for(i=0; i<numNotas; i++){
            // Se pide al usuario que entre las notas de los alumnos
            System.out.println("Indica la nota de un alumno");
            notaAlumno = datos.nextDouble();
            /*
            Esto es el filtro para introducir las notas, que deben ser de
            este intervalo
            */
            if(notaAlumno>=0 && notaAlumno<=10){
                notas.add(notaAlumno);
                suma += notaAlumno; //Suma de las notas
            } else {
                System.out.println("Error, debe ser un numero entre 0 y 10");
                i--; //Decremento para sobreescribir la variable erronea
            }  
        }
        prom = suma/notas.size();
        if(prom<5){
        System.out.println("La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més");
        } else if (prom>5 && prom<7){
        System.out.println("La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal");
        } else {
        System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
        }
    }
}

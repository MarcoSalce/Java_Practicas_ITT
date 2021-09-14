
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
public class M6Exercici2 {
    public static void main(String Args[]){
        /*
        Enunciado:
        Aquest programa calcula l'edat mitjana d'un número de persones introduït per teclat.
        S'ha de crear una funció que s'encarregui de demanar les edats a l'usuari i de calcular l'edat mitjana.
        La funció rebrà per paràmetre el nº de persones a qui ha de demanar l'edat.
        L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
        La mitjana de les edats introduïdes s'ha de retornar per la funció (return).
        */

        ArrayList <Double> edades = new ArrayList();
        int N;
        double media;
        
        //Invocamos al metodo para ver cuantas edades quieres.
        N = cantidadEdades();
        // Con esto leemos las edades que se han introducido
        leerEdades(edades,N);
        //Con este metodo calculamos el promedio (media) de las alturas.
        media = calcularPromedio(edades);
        //Mostramos en pantalla los resultados
        mostrarResultado(edades, media);
    }
    
    
    public static int cantidadEdades(){
        Scanner datos = new Scanner(System.in);
        int cant =0;
        do{
            System.out.println("Introduce el numero de edades: ");
            cant = datos.nextInt();
        } while (cant<1);
        return cant;
    }
    

    public static void leerEdades(ArrayList<Double> arr, int n){
        Scanner datos = new Scanner(System.in);
        int i;
        double edad;
        for (i = 1; i<=n; i++){
        System.out.println("Registre edades entre 0 y 120: ");
        edad = datos.nextInt();
        if (edad>=0 && edad <=120){
        arr.add(edad);
             } 
        else {
            System.out.println("Error: Introduce una edad en el rango");
        }
         }
    }

    public static double calcularPromedio(ArrayList<Double> arr){
        double media =0;
        for (Double temp: arr){ // Esto es un for each y se almacena en una variable temporal "temp"
            media = media + temp; 
        }
        return media/arr.size();
    }
    
    public static void mostrarResultado(ArrayList<Double> arr, double media){
        System.out.println("Edades introducidas: ");
        System.out.println(arr);
        System.out.println("La media es: " + media);
    }
}





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
public class M7Exercici1 {
    
    
    
    public static void main(String Args[]){
        
        // Variables
        double nota1, nota2, nota3, promedio;
        String respuesta = "";
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Indica la entrada de la primera nota");
        nota1 = datos.nextDouble();
        
        System.out.println("Indica la entrada de la segunda nota");
        nota2 = datos.nextDouble();
        
        System.out.println("Indica la entrada de la tercera nota");
        nota3 = datos.nextDouble();
        
        //Operaciones
        promedio = nota1 + nota2 + nota3 / 3;
        
        // Filtro
        
        if(promedio<5){
            respuesta = "No has superado el curso, tienes que mejorar";
            
        } else if (promedio>=5 && promedio<=7){
            respuesta = "Enhorabuena has aprobado, pero has de seguir practicando";
        } else {
            respuesta = "Enhorabuena has superado el curso, pasas al siguiente nivel";
        }
        
        //Respuesta
        System.out.println(respuesta);
    }  
}

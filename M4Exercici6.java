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
public class M4Exercici6 {
    public static void main(String Args[]){
        /*
        Fer un programa que demani a l’usuari quin dia i quin mes va néixer, 
        amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.
        ejercicio 6 = dia y mes int, signo de zodiaco string
        */ 
        
        int dia = 0;
        int mes = 0;
        String zodiaco = "";
        
        Scanner signo = new Scanner(System.in);
        System.out.println("¿Qué día naciste?");
        dia = signo.nextInt();
        
        System.out.println("¿Qué mes naciste?");
        mes = signo.nextInt();
        
        switch(mes){
            case 1:
                //Enero
                if(dia >= 20){
                    zodiaco = "Acuario";
                }else {
                    zodiaco = "Capricornio";
                }
                break;
            case 2:
                //Febrero
                if(dia >= 19){
                    zodiaco = "Piscis";
                }else {
                    zodiaco = "Acuario";
                }
                break;
            case 3:
                //Marzo
                if(dia >= 21){
                    zodiaco = "Aries";
                }else {
                    zodiaco = "Piscis";
                }
                break;
            case 4:
                //Abril
                if(dia >= 20){
                    zodiaco = "Tauro";
                }else {
                    zodiaco = "Aries";
                }
                break;
            case 5:
                //Mayo
                if(dia >= 21){
                    zodiaco = "Géminis";
                }else {
                    zodiaco = "Tauro";
                }
                break;
            case 6:
                //Junio
                if(dia >= 21){
                    zodiaco = "Cáncer";
                }else {
                    zodiaco = "Geminis";
                }
                break;   
            case 7:
                //Julio
                if(dia >= 23){
                    zodiaco = "Leo";
                }else {
                    zodiaco = "Cancer";
                }
                break;
            case 8:
                //Agosto
                if(dia >= 23){
                    zodiaco = "Virgo";
                }else {
                    zodiaco = "Leo";
                }
                break;
            case 9:
                //Septiembre
                if(dia >= 23){
                    zodiaco = "Libra";
                }else {
                    zodiaco = "Virgo";
                }
                break;
            case 10:
                //Octubre
                if(dia >= 23){
                    zodiaco = "Escorpio";
                }else {
                    zodiaco = "Libra";
                }
                break;
            case 11:
                //Noviembre
                if(dia >= 22){
                    zodiaco = "Sagitario";
                }else {
                    zodiaco = "Escorpio";
                }
                break;
            case 12:
                //Diciembre
                if(dia >= 22){
                    zodiaco = "Capricornio";
                }else {
                    zodiaco = "Sagitario";
                }
                break;    
    }
        System.out.println("Tu signo es zodiacal " + zodiaco);
    }
}

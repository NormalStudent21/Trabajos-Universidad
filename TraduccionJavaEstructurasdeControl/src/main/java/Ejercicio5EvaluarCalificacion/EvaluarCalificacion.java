/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5EvaluarCalificacion;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class EvaluarCalificacion {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        double calificacion = 0;
        do{
        System.out.println("---Bienvenido al Sistema de Evaluacion de Calificaciones");
        System.out.println("Ingrese su calificacion (0-10)");
        calificacion = entrada.nextDouble();
        }while((calificacion <= 0) || (calificacion > 10));
                
        if((calificacion >= 9) && (calificacion <= 10)) {
            System.out.println("Excelente");
        } else if((calificacion >= 8) && (calificacion <= 8.99)){
            System.out.println("Muy bueno");
        } else if((calificacion >= 7) && (calificacion <= 7.99)){
            System.out.println("Bueno");
        } else if((calificacion >= 5) && (calificacion <= 6.99)){
            System.out.println("Regular");
        } else{
            System.out.println("Deficiente");    
        }   
                
        
    }
}

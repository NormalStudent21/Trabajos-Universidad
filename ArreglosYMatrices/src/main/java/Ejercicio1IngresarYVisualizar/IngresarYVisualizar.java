/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio1IngresarYVisualizar;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class IngresarYVisualizar {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int i;
        int[] numeros = new int[5];
        System.out.println("---Bienvenido al Sistema de almacenamiento de numeros");
        for(i = 0; i <= 4; i++){
            System.out.println("Ingrese el " + (i+1) + " numero:");
            numeros[i] = entrada.nextInt(); 
        }
        System.out.println("Mostrando Numeros almacenados:");
        for(i = 0; i <= 4; i++){
            
            System.out.println("Posicion: " + (i+1) + ": " + numeros[i]);
        
        }
    }
    
}

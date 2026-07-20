/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3MayorEdad;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MayorEdad {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("---Bienvenido al registro de edad---");
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        
        }
        System.out.println("Registro Finalizado...");
        
    }    
}

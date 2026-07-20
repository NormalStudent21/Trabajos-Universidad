/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4RegistrarNota;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class RegistrarNota {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        double nota;
        
        System.out.println("---Bienvenido al Sistema de Registro de notas---");
        
        System.out.println("Ingrese su nota");
        
        nota = entrada.nextDouble();
        
        if (nota >= 7){
            
            System.out.println("Aprobado");
        
        } else{
            
            System.out.println("Reprobado");
        }
    }   
}

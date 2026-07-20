/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1PerfilEstudiante;

import java.util.Scanner;

/**
 *
 * @author Sergio Peñarreta
 */
public class PerfilEstudiante {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int edad;
        String carrera;
        double estatura;
        
        System.out.println("Bienvenido a la interfaz de ingreso a la universidad, porfavor ingrese los siguientes datos:");
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese su carrera");
        carrera = entrada.nextLine();
        System.out.println("Ingrese su estatura");
        estatura = entrada.nextDouble();
        System.out.println("Ingreso de datos finalizado");
        System.out.println("Cargando perfil del estudiante...");
        
        System.out.println("---Perfil del estudiante---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura +"m"); 
    }
}

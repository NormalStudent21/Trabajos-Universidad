/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class PerfilEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();
        
        mostrarDatos(nombre, edad);
        
    }

    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}
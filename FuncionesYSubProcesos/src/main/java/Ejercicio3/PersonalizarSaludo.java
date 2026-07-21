/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class PersonalizarSaludo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        saludar(nombre);
        
    }

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class CalcularOperaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        double numUno = entrada.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double numDos = entrada.nextDouble();
        
        operaciones(numUno, numDos);
        
    }

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: No se puede dividir entre cero.");
        }
    }
}
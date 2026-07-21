/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la calificacion 1: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("Ingrese la calificacion 2: ");
        double n2 = entrada.nextDouble();
        
        System.out.print("Ingrese la calificacion 3: ");
        double n3 = entrada.nextDouble();
        
        double promedio = calcularPromedio(n1, n2, n3);
        System.out.println("El promedio es: " + promedio);
        
        if (promedio >= 7) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante no aprobo.");
        }
        
  
    }

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
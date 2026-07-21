/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class ObtenerAreaRectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        double base = entrada.nextDouble();
        
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = entrada.nextDouble();
        
        double area = calcularArea(base, altura);
        System.out.println("El area del rectangulo es: " + area);
        
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
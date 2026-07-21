/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class DeterminarPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        
        boolean esNumeroPar = esPar(numero);
        
        if (esNumeroPar) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
        
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9MayorMenorMatriz;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
import java.util.Scanner;

public class MayorMenorMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] numeros = new int[5][5];
        
     
        int mayor = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE;

        System.out.println("---Bienvenido al Sistema que calcula el mayor y menor de una matriz ---");
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un numero para la posicion [" + (i+1) + "][" + (j+1) + "]: ");
                numeros[i][j] = entrada.nextInt();
                
                
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
                
                
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }
        }
        System.out.println("\n--- Mostrado Resultados... ---");
        System.out.println("El mayor valor en la matriz es: " + mayor);
        System.out.println("El menor valor en la matriz es: " + menor);
        
        entrada.close();
    }
}
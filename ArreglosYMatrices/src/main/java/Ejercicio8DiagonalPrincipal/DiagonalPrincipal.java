/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8DiagonalPrincipal;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class DiagonalPrincipal {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int[][] numeros = new int[4][4];
        int i, j;
        int sumaDiagonal = 0;
        System.out.println("---Bienvenido al Sistema de arreglos de Calculo de Diagonal Principal----");
        for(i=0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                System.out.println("Ingrese un numero en la posicion " + (i+1) + "," + (j+1));
                numeros[i][j] = entrada.nextInt();
                
            }
        }
        System.out.println("Mostrando tabla...");
         for(i=0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                if(i == j) {
                    System.out.print(numeros [i][j] + "   ");
                    sumaDiagonal += numeros[i][j];
                } else if (j < i){
                    System.out.print("   ");    
                }    
            }  
            System.out.println();
        }
        System.out.println("La suma de los elementos de la diagonal principal es : " + sumaDiagonal);
    }
}

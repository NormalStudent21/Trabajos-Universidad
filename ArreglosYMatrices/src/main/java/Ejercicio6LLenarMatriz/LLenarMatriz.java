/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6LLenarMatriz;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class LLenarMatriz {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int[][] numeros = new int[3][4];
        int i, j;
        for(i=0; i <= 2; i++){
            for(j = 0; j <= 3; j++){
                System.out.println("Ingrese un numero en la posicion " + (i+1) + "," + (j+1));
                numeros[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Mostrando tabla...");
         for(i=0; i <= 2; i++){
            for(j = 0; j <= 3; j++){
                System.out.print(numeros [i][j] + "   ");
            }
            System.out.println();
        }
    }   
}

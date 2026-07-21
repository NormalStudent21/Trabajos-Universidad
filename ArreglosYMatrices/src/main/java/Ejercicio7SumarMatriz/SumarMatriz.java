/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7SumarMatriz;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class SumarMatriz {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int[][] numeros = new int[4][4];
        int sumaMatriz = 0;
        int i, j;
        for(i=0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                System.out.println("Ingrese un numero en la posicion " + (i+1) + "," + (j+1));
                numeros[i][j] = entrada.nextInt();
                sumaMatriz += numeros[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + sumaMatriz);
    }   
}

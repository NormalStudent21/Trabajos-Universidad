/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4ParesEImpares;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class ParesEImpares {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0, impares = 0, sumaPares = 0, sumaImpares = 0;
        int i;
        System.out.println("---Bienvenido al Sistema de Pares e Impares");
        for(i = 0; i <= 19; i++){
            System.out.println("Ingrese el " + (i+1) + " numero");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0){
                pares += 1;
                sumaPares += numeros[i];            
            } else {
                impares += 1;
                sumaImpares += numeros[i];
            }
        }
        System.out.println("Mostrando resultados...");
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}

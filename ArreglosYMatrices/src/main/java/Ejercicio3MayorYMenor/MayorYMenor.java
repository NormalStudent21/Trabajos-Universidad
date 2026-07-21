/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3MayorYMenor;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class MayorYMenor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int mayor, menor;
        int i;
        int[] numeros = new int[15];
        int posicionMayor, posicionMenor;
        System.out.println("---Bienvenido al detector de numero mayor y menor---");
        System.out.println("Ingrese el primer valor");
        numeros[0] = entrada.nextInt();
        mayor = numeros[0];
        menor = numeros[0];
        posicionMenor = 0;
        posicionMayor = 0;
        for (i=1; i <= 14; i++){
            System.out.println("Ingrese el " + (i+1)  + " numero");
            numeros[i] = entrada.nextInt();
            if (numeros[i] > mayor ){
                mayor = numeros[i];
                posicionMayor = i;
            }
            if (numeros[i] < menor){
                menor = numeros[i];
                posicionMenor = i;
            }
        }
        System.out.println("Mostrando resultados...");
        System.out.println("Numero mayor: " + mayor + " posicion: " + (posicionMayor+1));
        System.out.println("Numero menor: " + menor + " posicion: " + (posicionMenor+1));
    }
}

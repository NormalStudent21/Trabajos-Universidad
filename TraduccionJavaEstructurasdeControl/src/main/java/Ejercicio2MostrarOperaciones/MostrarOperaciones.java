/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2MostrarOperaciones;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class MostrarOperaciones {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int numUno, numDos;
        System.out.println("---Bienvenido a la Calculadora de operaciones basicas---");
        System.out.println("Ingrese el primer numero (entero) ");
        numUno = entrada.nextInt();
        System.out.println("Ingrese el segundo numero(entero) ");
        numDos = entrada.nextInt();
        System.out.println("A continuacion se mostraran las operaciones basicas entre aquellos dos numeros:");
        System.out.println("Suma: " + (numUno + numDos));
        System.out.println("Resta: " + (numUno - numDos));
        System.out.println("Multiplicacion: " + (numUno * numDos));
        System.out.println("Division: " + ((double) numUno / numDos));
        System.out.println("Residuo: " + (numUno % numDos));
        
    }   
    
}

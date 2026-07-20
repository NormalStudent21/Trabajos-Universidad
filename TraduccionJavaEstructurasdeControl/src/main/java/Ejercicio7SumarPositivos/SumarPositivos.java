/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7SumarPositivos;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SumarPositivos {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int totalNumeros = 0;
        double num;
        double sumaNumeros = 0;
        System.out.println("---Bienvenido al Sumador de numeros positivos");
        do{
            System.out.println("Ingrese un numero positvo para sumar (para terminar ingrese un negativo)");
            num = entrada.nextDouble();
            if (num >= 0){
                sumaNumeros += num;
                totalNumeros ++;
            }    
        } while(num >= 0);
        System.out.println("---Sumatoria finalizada, mostrando resultados: ---");
        System.out.println("Total de numeros Ingresados: " + totalNumeros);
        System.out.println("Sumatoria de numeros ingresados: " + sumaNumeros);
    }
    
}


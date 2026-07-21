/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2SumarYPromediar;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class SumarYPromediar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        int i;
        double sumaTotal = 0;
        double promedio;
        System.out.println("---Bienvenido al sistema de promedio y sumatoria");
        for(i = 0; i <= 9; i++){
            System.out.println("Ingrese el " + (i+1) + " valor:");
            numeros[i] = entrada.nextDouble();
            sumaTotal += numeros[i];
        }
        promedio = sumaTotal / 10;
        System.out.println("Mostrando resultados...");
        System.out.println("Promedio: " + promedio);
        System.out.println("Suma total: " + sumaTotal);
    }
}

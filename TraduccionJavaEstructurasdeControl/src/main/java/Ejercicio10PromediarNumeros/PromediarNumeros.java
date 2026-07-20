/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10PromediarNumeros;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PromediarNumeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int num;
        int i;
        int sumaNums = 0;
        double promedio;
        for(i = 1; i <= 10; i++){
            System.out.println("Ingrese el: " + i + " numero");
            num = entrada.nextInt();
            sumaNums += num;
        }
        promedio = (double)sumaNums / 10;
        System.out.println("Sumatoria de numeros: " + sumaNums);
        System.out.println("Promedio: " + promedio);
    }   
}

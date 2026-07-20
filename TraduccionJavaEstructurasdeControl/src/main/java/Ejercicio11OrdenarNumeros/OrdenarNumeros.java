/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11OrdenarNumeros;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class OrdenarNumeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double num;
        double mayor, menor;
        int i;
        System.out.println("---Bienvenido al Sistema---");
        System.out.print("Ingrese el primer numero");
        num = entrada.nextDouble();
        mayor = num;
        menor = num;
        for (i = 2; i <= 10; i++){
            System.out.println("Ingrese el " + i + " numero");
            num = entrada.nextDouble();
            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("Numero menor: " + menor);
        System.out.println("Numero mayor; " + mayor);
    }
}

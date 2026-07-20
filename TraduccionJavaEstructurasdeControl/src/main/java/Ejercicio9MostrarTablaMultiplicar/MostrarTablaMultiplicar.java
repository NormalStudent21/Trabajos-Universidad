/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9MostrarTablaMultiplicar;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MostrarTablaMultiplicar {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int num;
        int i;
        System.out.println("---Bienvenido al Sistema de tablas de Multiplicar---");
        System.out.println("Ingrese el numero del cual desea ver su tabla de multiplicar");
        num = entrada.nextInt();
        for (i = 1; i <= 12; i++){
            
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class RetornarMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el numero A: ");
        int a = entrada.nextInt();
        
        System.out.print("Ingrese el numero B: ");
        int b = entrada.nextInt();
        
        int numeroMayor = mayor(a, b);
        System.out.println("El numero mayor es: " + numeroMayor);
        
    }

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class NumerosPar {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema, a continuacion se mostraran los numeros paren del 2 al 100");
        mostrarPares();
    }

    public static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
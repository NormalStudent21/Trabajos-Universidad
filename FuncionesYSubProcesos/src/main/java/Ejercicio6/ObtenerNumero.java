/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class ObtenerNumero {
    public static void main(String[] args) {
        int numero = obtenerNumero();
        System.out.println("El numero aleatorio generado es: " + numero);
    }

    public static int obtenerNumero() {
        return (int) (Math.random() * 100) + 1;
    }
}
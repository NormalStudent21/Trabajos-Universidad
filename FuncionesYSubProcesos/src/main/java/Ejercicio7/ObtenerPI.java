/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class ObtenerPI {
    public static void main(String[] args) {
        double pi = obtenerPI();
        System.out.println("El valor recibido es: " + pi);
    }

    public static double obtenerPI() {
        return Math.round(Math.PI * 10000.0) / 10000.0;
    }
}
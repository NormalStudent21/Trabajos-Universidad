/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8IngresarContrasenia;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class IngresarContrasenia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String clave;
        System.out.println("---Bienvenido al sistema, para acceder ingrese su clave de acceso---");
        do{
            System.out.println("Ingrese su clave: ");
            clave = entrada.nextLine();
            if (!"java2026".equals(clave)){
                System.out.println("Clave incorrecta vuelva a intentarlo");
            }
        } while (!"java2026".equals(clave));
        System.out.println("Acceso concedido");
    }
    
}

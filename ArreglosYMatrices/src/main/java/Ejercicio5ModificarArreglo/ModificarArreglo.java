/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5ModificarArreglo;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class ModificarArreglo {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double[] numeros = new double[12];
        int i;
        System.out.println("Bienvenido al sistema de modificar arreglo");
        for(i = 0; i <= 11; i++){
            do{
                System.out.println("Ingrese un numero (debe ser positivo)");
                numeros [i] = entrada.nextInt() + (i+1);
                if(numeros [i] < 0){
                    System.out.println("numero no valido ingrese un numero positivo");
                }
            } while(numeros[i] < 0);
        }
        System.out.println("Mostrando resultados...");
        for(i = 0; i <= 11; i++){
            System.out.println(numeros[i]);
        }
    }
}

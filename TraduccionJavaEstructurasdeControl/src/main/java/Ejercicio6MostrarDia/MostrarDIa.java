/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6MostrarDia;
import java.util.Scanner;
/**
 *
 * @author Sergio Laksman Peñarreta Morales
 */
public class MostrarDIa {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int dia; 
        System.out.println("---Bienvenido al Sistema de agendas---");
        System.out.println("Ingrese el numero del dia de la semana que busca");
        dia = entrada.nextInt();
        switch (dia){
                case 1 -> System.out.println("1. Lunes");
                case 2 -> System.out.println("2. Martes");
                case 3 -> System.out.println("3. Miercoles");
                case 4 -> System.out.println("4. Jueves");
                case 5 -> System.out.println("5. Viernes");
                case 6 -> System.out.println("6. Sabado");
                case 7 -> System.out.println("7. Domingo");
        }            
    }   
}

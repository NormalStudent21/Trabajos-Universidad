    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Ejercicio10ModificarMatriz;
    import java.util.Scanner;
    /**
     *
     * @author Sergio Laksman Peñarreta Morales
     */
    public class ModificarMatriz {
        public static void main(String[] args){
            Scanner entrada = new Scanner (System.in);
            int[][] numeros = new int[3][5];
            int i, j;
            System.out.println("---Bienvenido al Sistema Matriz Modificada---");
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 4; j++) {
                    System.out.print("Ingrese un numero para la posicion: " + (i+1) + "," + (j+1) + ":"); 
                    numeros[i][j] = (entrada.nextInt() + ((i+1)*(j+1))); 
                }
            }
            System.out.println("Mostrando tabla...");
             for(i = 0; i <= 2; i++){
                for(j = 0; j <= 4; j++){
                    System.out.print(numeros[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }

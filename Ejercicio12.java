/*Dado un número positivo, mostrar los divisores del número ingresado. */

import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[]args){
        int numeroEntrada = 0;
        float numeroTempo = 0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Ingresa un nÃºmero positivo: "); 
        numeroEntrada = sc.nextInt (); 
        System.out.println("Los nÃºmeros divisores son: ");
        for (int i = 1; i <=numeroEntrada; i ++){
            if ((numeroEntrada % i) == 0){
                System.out.println( "\n" + i);
            }
        }
    }
}
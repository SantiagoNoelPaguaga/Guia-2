
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SantiagoPaguaga
 * Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        System.out.println("La Suma de los números es: " + (num1 + num2));
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SantiagoPaguaga
 * Escribir un programa que lea un número entero por teclado y 
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        System.out.println("El doble del número es: " + (numero * 2));
        System.out.println("El triple del número es: " + (numero * 3));
        System.out.println("La raíz cuadrada del número es: " + Math.sqrt(numero));
    }
    
}

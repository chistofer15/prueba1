/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo16_pruebas;

import java.util.Scanner;

/**
 *
 * @author Cristopher Burgos
 */
public class Ejemplo16_Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int a, b, suma;

        Scanner leer = new Scanner(System.in);

        System.out.println("SUMA DE DOS NUMEROS ENTERitos");

        System.out.print("Ingrese primer número: ");

        a = leer.nextInt();

        System.out.print("Ingrese primer número: ");

        b = leer.nextInt();

        suma = sumar(a, b);

        System.out.println("La suma de los números es: " + suma);

    } // Fin del método main

    public static int sumar(int a, int b) {

        return a + b;

    } // Fin del método sumar

}

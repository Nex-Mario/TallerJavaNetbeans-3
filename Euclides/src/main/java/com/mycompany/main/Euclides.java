/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número positivo: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el segundo número positivo: ");
        int n = scanner.nextInt();

        int mcd = euclidesMCD(m, n);

        System.out.println("El MCD de " + m + " y " + n + " es " + mcd);
        
        scanner.close();
    }

    // Función para calcular el MCD usando el algoritmo de Euclides
    public static int euclidesMCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}


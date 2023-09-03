/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

public class Nmayor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad deseada: ");
        int cantidadDeseada = scanner.nextInt();
        
        int suma = 0;
        int N = 0;

        while (suma <= cantidadDeseada) {
            N++;
            suma += N;
        }

        System.out.println("El número natural más pequeño N cuya suma de los N primeros números excede " + cantidadDeseada + " es " + N);

        scanner.close();
    }
}
  
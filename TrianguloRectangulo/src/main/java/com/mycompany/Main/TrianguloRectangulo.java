/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        // Calcular los ángulos agudos usando funciones trigonométricas
        double angulo1 = Math.toDegrees(Math.atan(cateto1 / cateto2));
        double angulo2 = Math.toDegrees(Math.atan(cateto2 / cateto1));

        // Imprimir resultados
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Ángulo agudo 1: " + angulo1 + " grados");
        System.out.println("Ángulo agudo 2: " + angulo2 + " grados");

        scanner.close();
    }
}


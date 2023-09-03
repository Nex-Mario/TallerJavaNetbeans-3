/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

import java.util.Scanner;

public class InformeVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de productos vendidos en el día: ");
        int n = scanner.nextInt();

        // Declaración de arreglos para almacenar la información de ventas
        int[] codigos = new int[n];
        double[] valoresVenta = new double[n];
        int[] cantidadesVendidas = new int[n];

        // Leer los datos de ventas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el código del producto #" + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();
            System.out.print("Ingrese el valor de venta del producto #" + (i + 1) + ": ");
            valoresVenta[i] = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de unidades vendidas del producto #" + (i + 1) + ": ");
            cantidadesVendidas[i] = scanner.nextInt();
        }

        // Calcular el total de productos vendidos y los ingresos por ventas del día
        int totalProductosVendidos = 0;
        double totalIngresos = 0;

        for (int i = 0; i < n; i++) {
            totalProductosVendidos += cantidadesVendidas[i];
            totalIngresos += valoresVenta[i] * cantidadesVendidas[i];
        }

        // Encontrar el producto más vendido y el producto más costoso
        int productoMasVendido = codigos[0];
        double productoMasCostoso = valoresVenta[0];

        for (int i = 1; i < n; i++) {
            if (cantidadesVendidas[i] > cantidadesVendidas[i - 1]) {
                productoMasVendido = codigos[i];
            }
            if (valoresVenta[i] > productoMasCostoso) {
                productoMasCostoso = valoresVenta[i];
            }
        }

        // Imprimir los resultados
        System.out.println("Total productos vendidos en el día: " + totalProductosVendidos);
        System.out.println("Total ingresos por ventas del día: $" + totalIngresos);
        System.out.println("Producto más vendido (código): " + productoMasVendido);
        System.out.println("Producto más costoso vendido (código): " + productoMasCostoso);

        scanner.close();
    }
}


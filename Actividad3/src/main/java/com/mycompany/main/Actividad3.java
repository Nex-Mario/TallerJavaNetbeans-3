
package com.mycompany.main;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double longitud;
        double anchura;
        
        System.out.print("Dijite la longitud: ");
        longitud = entrada.nextDouble();
        System.out.print("Dijite la anchura: ");
        anchura = entrada.nextDouble();
        
        double superficie = calculosuperficie(anchura,longitud);
        
        System.out.println("La superficie es: "+superficie);
        
    }
    public static double calculosuperficie(double n1, double n2 ){
        return n1 * n2;
    }
}

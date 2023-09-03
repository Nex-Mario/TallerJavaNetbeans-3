
package com.mycompany.main;

import java.util.Scanner;

public class Nnumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        double acum = 0;
        System.out.print("Dijite N: ");
        n = entrada.nextInt();
        
        for(int i=1;i<=n;i++){
            acum+=i/2^i;
        }
        
        System.out.println("La suma de sus "+n+" terminos es: "+acum);
    }
}

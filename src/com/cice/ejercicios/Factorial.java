package com.cice.ejercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);

        long numeroIntroducido = sc.nextLong();
        long factorial = 1;

        for(long i=1; i <= numeroIntroducido;i++){

            factorial *=i;
        }
        System.out.println("El factorial es de "+  numeroIntroducido+ " es "+factorial);
    }


}

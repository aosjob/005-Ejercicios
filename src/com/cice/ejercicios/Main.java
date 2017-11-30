package com.cice.ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    int num = 4;
//    int moduloDivision = num % 2;

//    if (moduloDivision==0){
//        System.out.println("El número "+moduloDivision +" es par");
//
//
//    }else{
//
//        System.out.println("El número "+moduloDivision +" es impar");
//
//    }

        System.out.println("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = sc.nextInt();
        int moduloDivision = numeroIntroducido % 2;




        if (moduloDivision==0){
            System.out.println("El número "+numeroIntroducido +" es par");


        }else{

            System.out.println("El número "+numeroIntroducido +" es impar");

        }

    }
}

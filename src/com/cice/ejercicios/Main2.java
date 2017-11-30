package com.cice.ejercicios;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //buenos dias 12
        //buenas tardes 20h
        // buenas noches 21

        System.out.println("Introduzca la hora 0 a 24h: ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();



        if ( hora >= 6 && hora <12 ){
            System.out.println("Son las "+hora +"Buenos días");

        }
        else if ( hora >= 12 && hora <21 ){
            System.out.println("Son las "+hora +"Buenos tardes");

        }
        else if ((hora >=0 && hora < 6)|| (hora >=21 && hora <=24)) {
            System.out.println("Son las "+hora +"Buenos noches");

        }else {

            System.out.println("No ha introducido una hora validad");
        }





    }

}

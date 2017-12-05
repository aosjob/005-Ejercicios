package com.cice.ejercicios;

import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        numeros = new int []{1,2,3,4,5};
        for (int i= 0; i < numeros.length; i++){
            System.out.println(numeros [i]);

        }
        System.out.println("*******************");
        //la coleccion va en plural y la variable en singular
        for(int numero : numeros){

            System.out.println(numero);

        }

       /* seria un bucle infito porque siempre es treu

       while(true){



        }*/
        System.out.println("*******************");
       int condicion = 3;
        while (numeros[4] > condicion && 1==1){


            System.out.println(condicion++);//3 y 4


        }
        System.out.println("*******************");
        do{

            System.out.println(condicion++);//3 y 4

        }while(numeros[4] > condicion);

    }
}

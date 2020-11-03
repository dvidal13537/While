package com.company;

import java.util.Scanner;

public class ExWhile {
    public static void Ex1() {

        //Demanar un número num per teclat i imprimir per pantalla tots els números des de 0 fins a num.
        System.out.println("\nElije un numero, el que tu quieras:");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();

        for (int b = 0; b < num; b++) {
            System.out.println(b);

        }
    }

    public static void Ex2() {
        //Demana números per teclat fins que s’introdueixi un número negatiu.

        System.out.println("Elije un numero, el que tu quieras(para acabar el bucle pon uno negativo)");
        Scanner b = new Scanner(System.in);
        int neg = b.nextInt();

        while (neg > 0) {
            System.out.println("Elije un numero, el que tu quieras(para acabar el bucle pon uno negativo)");
            neg = b.nextInt();
        }
    }

    public static void Ex3() {
        //Demana un número per teclat i digues si és positiu o negatiu. Repeteix el procés finsque s’introdueixi un 0.

        System.out.println("Elije un numero, el que tu quieras:");
        Scanner b = new Scanner(System.in);
        int neg = b.nextInt();

        while (neg == 0) {
            System.out.println("Elije un numero, el que tu quieras:");
            neg = b.nextInt();
        }
            if (neg > 0)
                System.out.println("El numero es positivo");
            if (neg < 0)
                System.out.println("El numero es negativo");
    }
}

package com.company;

import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);

    int posicion1;
    int posicion2;

    void decidirPosicion(){
        System.out.println("Que cartas quieres levantar? 1-8");

        posicion1 = sc.nextInt()-1;
        posicion2 = sc.nextInt()-1;
    }
}

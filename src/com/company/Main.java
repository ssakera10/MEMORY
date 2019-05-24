package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int posicion1;
        int posicion2;

        boolean victoria=false;


        String string1 = "♠";
        String string2 = "♣";
        String string3 = "♥";
        String string4 = "♦";
        int anterior;


        String[] cartasdesorden = new String[]{"", "", "", "", "", "", "", ""};
        int random = new Random().nextInt(8);

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (cartasdesorden[random] == "") {
                cartasdesorden[random] = string1;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (cartasdesorden[random] == "") {
                cartasdesorden[random] = string2;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (cartasdesorden[random] == "") {
                cartasdesorden[random] = string3;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (cartasdesorden[random].equals("")) {
                cartasdesorden[random] = string4;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        System.out.println(Arrays.toString(cartasdesorden));

        String[] bocaabajo = new String[]{"X", "X", "X", "X", "X", "X", "X", "X"};


        while (victoria==false) {

            System.out.println("Que cartas quieres levantar? 1-8");

            posicion1 = sc.nextInt()-1;
            posicion2 = sc.nextInt()-1;

            if(cartasdesorden[posicion1].equals(cartasdesorden[posicion2])){
                System.out.println("Has acertado");
                bocaabajo[posicion1]=cartasdesorden[posicion1];
                bocaabajo[posicion2]=cartasdesorden[posicion2];

                for (int j = 0; j <bocaabajo.length ; j++) {
                    System.out.print(bocaabajo[j] +  " ");
                }
                System.out.println();
            } else{
                for (int i = 0; i < cartasdesorden.length; i++) {
                    if(i == posicion1 || i == posicion2){
                        System.out.print(cartasdesorden[i] + " ");
                    } else {
                        System.out.print(bocaabajo[i] + " ");
                    }
                }
                System.out.println();
            }

            victoria = true;
            for (int i = 0; i < cartasdesorden.length; i++) {
                if(!cartasdesorden[i].equals(bocaabajo[i])){
                    victoria=false;
                    break;
                }
            }

            if (victoria==true){
                System.out.println("Has ganado oh yeah");
            }
        }
    }
}

package com.company;

import java.util.Random;

public class Cartas {

    String string1 = "♠";
    String string2 = "♣";
    String string3 = "♥";
    String string4 = "♦";
    int anterior;
    String[] desordenadas = new String[]{"", "", "", "", "", "", "", ""};
    String[] bocaabajo = new String[]{"X", "X", "X", "X", "X", "X", "X", "X"};


    void mezclarCartas(){
        int random = new Random().nextInt(8);

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (desordenadas[random] == "") {
                desordenadas[random] = string1;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (desordenadas[random] == "") {
                desordenadas[random] = string2;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (desordenadas[random] == "") {
                desordenadas[random] = string3;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }

        for (int i = 0; i < 2; i++) {
            anterior = random;
            if (desordenadas[random].equals("")) {
                desordenadas[random] = string4;
                random = new Random().nextInt(8);
            } else if (random == anterior) {
                random = new Random().nextInt(8);
                i = i - 1;
            }
        }
    }

    void girar(int posicion1, int posicion2){
        bocaabajo[posicion1]=desordenadas[posicion1];
        bocaabajo[posicion2]=desordenadas[posicion2];
    }

    void mostrar(){
        for (int j = 0; j <bocaabajo.length ; j++) {
            System.out.print(bocaabajo[j] +  " ");
        }
        System.out.println();
    }

    void mostrarElegidas(int posicion1, int posicion2){
        for (int i = 0; i < desordenadas.length; i++) {
            if(i == posicion1 || i == posicion2){
                System.out.print(desordenadas[i] + " ");
            } else {
                System.out.print(bocaabajo[i] + " ");
            }
        }
        System.out.println();
    }

    boolean comprobarTodasGiradas(){
        boolean todasGiradas = true;
        for (int i = 0; i < desordenadas.length; i++) {
            if(!desordenadas[i].equals(bocaabajo[i])){
                todasGiradas=false;
                break;
            }
        }

        return todasGiradas;
    }

}

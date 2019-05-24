package com.company;

import java.util.Arrays;

public class Partida {
    boolean victoria = false;
    Cartas cartas;
    Jugador jugador;


    void jugar(){
        cartas = new Cartas();
        jugador = new Jugador();

        cartas.mezclarCartas();



        while(victoria == false){

            jugador.decidirPosicion();

            if(cartas.desordenadas[jugador.posicion1].equals(cartas.desordenadas[jugador.posicion2])){
                System.out.println("Has acertado");

                cartas.girar(jugador.posicion1, jugador.posicion2);

                cartas.mostrar();
            } else {
                cartas.mostrarElegidas(jugador.posicion1, jugador.posicion2);
            }


            boolean victoria = cartas.comprobarTodasGiradas();

            if(victoria){
                System.out.println("Has ganado");
            }
        }
    }
}


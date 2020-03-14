package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //creo tres gatos
        Gato gatoUno = new Gato("Garfiel");
        Gato gatoDos = new Gato("Alfred");
        Gato gatoTres = new Gato("Atun");
        // creo 4 ratones
        Raton ratonUno = new Raton("Jerry",50);
        Raton ratonDos = new Raton("Jerry",50);
        Raton ratonTres = new Raton("Jerry",50);
        Raton ratonCuatro = new Raton("Jerry",50);
        // creo una lista de ratones, con los cuatro ratones antes creados
        List<Raton> listaDeRatones = new ArrayList<>(){
            listaDeRatones.add(Raton ratonUno);
        }
    // pruebo comer raton
        // pruebo comer lista de ratones
        // pruebo comer meConviene comer
    }
}

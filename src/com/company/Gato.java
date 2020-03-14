package com.company;

import java.util.List;

public class Gato {
    private String nombre;
    private Double energia;
    private Double velocidad;

    public Gato(String nombre, Integer energia, Integer velocidad) {
        this.nombre = nombre;
        this.energia = 0.0;
        this.velocidad = 5.0;
    }

    public void comerRaton(Raton unRaton) {
        this.energia = this.energia + unRaton.getPeso();
        System.out.println("me comi un raton mi nueva energia es " + energia);
    }

    public void comerRaton(List<Raton> ratones) {
        for (Raton unRaton : ratones) {
            comerRaton(unRaton);
        }
    }

    public Double correr(Integer cantidadDeMetros) {
        this.energia = this.energia - 0.5*cantidadDeMetros;
        return cantidadDeMetros/this.velocidad;
    }




}

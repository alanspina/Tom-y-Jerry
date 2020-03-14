package com.company;

public class Raton {
    private String nombre;
    private Integer peso;

    public Raton(String nombre, Integer peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPeso() {
        return peso;
    }
}

package com.gremio.model;

public class aventurero {

    private String nombre;
    private String clase;   
    private int nivel;

    public aventurero(String nombre, String clase, int nivel) {
        this.nombre = nombre;
        this.clase  = clase;
        this.nivel  = nivel;
    }

    public String getNombre() { return nombre; }
    public String getClase()  { return clase; }
    public int    getNivel()  { return nivel; }
}
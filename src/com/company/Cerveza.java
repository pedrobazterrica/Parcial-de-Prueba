package com.company;

public abstract class Cerveza {
    private int id;
    private String nombre;
    private float precio;
    private float ABV;
    private String descripcion;

    protected Cerveza(int id,String nombre, float precio, float ABV, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ABV = ABV;
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }
    public float calcularCostoDeProduccion(){
        return precio;
    }

    @Override
    public String toString(){
        return "Cerveza[id:"+this.id+"/ nombre:"+this.nombre+"/ precio:"+this.precio+"]";
    }

    public int getId() {
        return id;
    }
}

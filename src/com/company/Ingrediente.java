package com.company;

public class Ingrediente {
    private int id;
    private String nombre;
    private String descripcion;
    private float cantidad;
    private float precioUnidad;

    public Ingrediente(int id,String nombre,String descripcion, float cantidad, float precioUnidad){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public float getPrecio(){
        float precio = this.precioUnidad*this.cantidad;
        return precio;
    }

    @Override
    public String toString(){
        return "";
    }
}

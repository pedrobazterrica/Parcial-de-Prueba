package com.company;

public class Negra extends TipoCerveza {

    public Negra(int id,String nombre, float precio, float ABV, String descripcion,float porcentajeComplejidad,Receta receta){
        super(id,nombre,precio,ABV,descripcion,porcentajeComplejidad,receta);
    }

    @Override
    public float calcularCostoDeProduccion(){
        float costo = super.calcularCostoDeProduccion()*1.2f;
        return costo;
    }
}

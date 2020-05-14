package com.company;

public class Rubia extends TipoCerveza {

    public Rubia(int id,String nombre, float precio, float ABV, String descripcion,float porcentajeComplejidad,Receta receta){
        super(id,nombre,precio,ABV,descripcion,porcentajeComplejidad,receta);
    }



    @Override
    public float calcularCostoDeProduccion(){
        float costo = super.calcularCostoDeProduccion()*1.1f;
        return costo;
    }
}

package com.company;

public abstract class TipoCerveza extends Cerveza{
    private boolean gluten;
    private float porcentajeComplejidad;
    private Receta receta;

    protected TipoCerveza(int id,String nombre, float precio, float ABV, String descripcion, float porcentajeComplejidad, Receta receta){
        super(id, nombre,precio, ABV,descripcion);
        this.porcentajeComplejidad = porcentajeComplejidad;
        this.receta = receta;
        this.gluten = false;
    }

    public void fabricarConSinFluten(){
        this.gluten = true;
    }

    @Override
    public float calcularCostoDeProduccion(){
        float precio = 0;
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            precio += ingrediente.getPrecio();
        }
        if(this.gluten){
            precio = precio*1.02f;
        }
        return precio;
    }

    @Override
    public String toString(){
        return super.toString()+"";
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private int id;
    private String nombre;
    private String pais;
    private List<Ingrediente> ingredientes;

    public Receta(int id,String nombre,String pais){
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void quitarIngrediente(Ingrediente ingrediente){
        ingredientes.remove(ingrediente);
    }

    @Override
    public String toString(){
        return "";
    }


}

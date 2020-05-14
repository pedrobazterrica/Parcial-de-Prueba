package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int id;
    private String nombre;
    private String direccion;
    private List<Cerveza> cervezas;

    public Fabrica(int id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cervezas = new ArrayList<Cerveza>();
    }

    public boolean checkRepetition(Cerveza cerveza){
        boolean check = true;
        for(Cerveza cerveza1 : cervezas){
            if(cerveza1 == cerveza){
                check = false;
            }
        }
        return check;
    }

    public void agregarCerveza(Cerveza cerveza){
        if(checkRepetition(cerveza)){
            cervezas.add(cerveza);
        }else{
            System.out.println("Ya tiene esa cerveza");
        }
    }

    public int indexCerveza(int id){
        int index = -1;
        for(Cerveza cerveza : cervezas){
            if(cerveza.getId() == id){
                index = cervezas.indexOf(cerveza);
            }
        }
        return index;
    }

    public void quitarCerveza(int id){
        int index = indexCerveza(id);
        if(index == -1){
            System.out.println("No tenia esa cerveza");
        }else{
            cervezas.remove(index);
        }
    }

    @Override
    public String toString(){
        return "";
    }
}

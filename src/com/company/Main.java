package com.company;

public class Main {

    public static void main(String[] args) {
	    Ingrediente ingrediente1 = new Ingrediente(1,"Malta","",3, 4.5f);
	    Ingrediente ingrediente2 = new Ingrediente(2,"Alcohol","",6,3.2f);
	    Ingrediente ingrediente3 = new Ingrediente(3,"hojas","",1.2f,5.1f);
	    Ingrediente ingrediente4 = new Ingrediente(4,"papa","",1.5f,5.4f);
	    Ingrediente ingrediente5 = new Ingrediente(5,"Locro","",5.6f,30f);
        Receta receta1 = new Receta(1,"Piolin","arg");
        Receta receta2 = new Receta(2,"Chetin","bra");
        Receta receta3 = new Receta(3,"Caquin","chi");
        receta1.agregarIngrediente(ingrediente1);
        receta1.agregarIngrediente(ingrediente2);
        receta1.agregarIngrediente(ingrediente3);
        receta2.agregarIngrediente(ingrediente1);
        receta2.agregarIngrediente(ingrediente2);
        receta2.agregarIngrediente(ingrediente4);
        receta3.agregarIngrediente(ingrediente1);
        receta3.agregarIngrediente(ingrediente2);
        receta3.agregarIngrediente(ingrediente5);
        Cerveza cerveza1 = new Roja(1,"rojita",3f,4f,"",45f,receta1);
        Cerveza cerveza2 = new Rubia(2,"rubiea",5f,4f,"",45f,receta2);
        Cerveza cerveza3 = new Negra(3,"marron",7f,3f,"",51f,receta3);
        Fabrica fabrica = new Fabrica(1,"Maincra","");
        fabrica.agregarCerveza(cerveza1);
        fabrica.agregarCerveza(cerveza2);
        fabrica.agregarCerveza(cerveza3);
        System.out.println(cerveza1.toString());

    }
}

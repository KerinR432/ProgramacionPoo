package POOUD8Coleciones;

import java.util.ArrayList;

public class EjemploArraysList {
    public static void main(String[] args) {
        //1.- Creamos el arraylist
        ArrayList<Integer> numero = new ArrayList<>();
        //2.- Usamos la colección mediante sus métodos
        //añadimos un elemento en la lista
        numero.add(5); //add es para añadir
        numero.add(0);
        numero.add(10);
        numero.add(8);
        System.out.println(numero);
        //borramos el segundo elemento
        numero.remove(1);
        System.out.println(numero);
        //borramos un elemento por indice
        numero.remove(numero.size()-1);//remove asi eleminamos.
        System.out.println(numero);
    }
}
zº
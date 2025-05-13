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
        //borramos un elemento por índice
        numero.removeLast();//remove asi eliminamos.
        System.out.println(numero);
        System.out.println(numero.contains(10));
        //mostrar los valores de arrays
        //da un numero
        for (int num : numero) {
            System.out.println("valor: " + num);
        }
        System.out.println("El valor 10 estan el posición: "+numero.indexOf(10));//muestra la posicion del valor
        numero.set(0,55);//modifica la posion 0 con el valor que pasemos por parametro.
        System.out.println(numero);
        
    }
}
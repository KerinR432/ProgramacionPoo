package POOUD8Coleciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class colores {
    static HashMap<Integer,String> colores = new HashMap<Integer,String>();
    static HashMap<Integer,String> colores2 = new HashMap<Integer,String>();
    static HashMap<String,Integer> Invertido = new HashMap<String,Integer>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        int op = 1;
        String nombre = "";
        do {
            menu("Introduce una opcion\n1) insertar\n2) mostrar\n3) clonar\n0) Salir");
            op = in.nextInt();
            switch (op){
                case 1:
                    rellenarHashMap();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    clonar();
                    break;
                case 4:
                    invertir();
                    break;


            }

        }while(op!=0);
    }

    private static void menu(String x) {
        System.out.println(x);
    }

    private static void mostrar() {
        Set<Integer> claves = colores.keySet();
        Set<Integer> claves2 = colores2.keySet();
        Set<String> claves3 = Invertido.keySet();
        for(Integer key : claves){
            menu("Hola soy el HashMap 1");
            menu("Clave: " + key + " valor: " + colores.get(key));
        }
        System.out.println(claves);
        for(Integer key : claves2){
            menu("Hola soy el HashMap 2");
            menu("Clave: " + key + " valor: " + colores2.get(key));
        }
        for(String key : claves3){
            menu("Hola soy el HashMap 3");
            menu("Clave: " + key + " valor: " + Invertido.get(key));
        }
    }

    private static void clonar() {
        Set<Integer> cla2 = colores2.keySet();
        for (Integer key: cla2){
            colores.put(key,colores2.get(key));
            colores2.remove(key);

        }
    }

    private static void invertir() {
        ArrayList<Integer>llaves = new ArrayList<Integer>();
        llaves.addAll(colores.keySet());
        llaves.addAll(colores2.keySet());
        for (Integer key : llaves){
            String contenido =(key<5)? colores.get(key):colores2.get(key);
            menu(contenido);
            Invertido.put(contenido,key);
        }
    }

    private static void rellenarHashMap() {
        int clave;
        String nombre;
        do{
            menu("Introduce una clave: ");
            clave = in.nextInt();
            in.nextLine();

        }while (colores.containsKey(clave));
        menu("Nombre");
        nombre = in.nextLine();
        if (clave>5){
            colores2.put(clave,nombre);
        }else {
            colores.put(clave, nombre);
        }
    }
}

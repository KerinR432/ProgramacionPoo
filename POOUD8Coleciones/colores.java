package POOUD8Coleciones;

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
            System.out.println("Introduce una opcion\n1) insertar\n2) mostrar\n3) clonar\n0) Salir");
            op = in.nextInt();
            switch (op){
                case 1:
                    rellenarHashMap();
                    break;
                case 2:
                    Set<Integer> claves = colores.keySet();
                    Set<Integer> claves2 = colores2.keySet();
                    Set<String> claves3 = Invertido.keySet();
                    for(Integer key : claves){
                        System.out.println("Hola soy el HashMap 1");
                        System.out.println("Clave: "+key+" valor: "+ colores.get(key));
                    }
                    System.out.println(claves);
                    for(Integer key : claves2){
                        System.out.println("Hola soy el HashMap 2");
                        System.out.println("Clave: "+key+" valor: "+ colores2.get(key));
                    }
                    for(String key : claves3){
                        System.out.println("Hola soy el HashMap 3");
                        System.out.println("Clave: "+ Invertido.get(nombre)+" valor: "+ key);
                    }
                    System.out.println(claves3);
                    break;
                case 3:
                    Set<Integer> cla2 = colores2.keySet();
                    for (Integer key: cla2){
                        colores.put(key,colores2.get(key));
                        colores2.remove(key);
                        break;
                    }
                case 4:
                    Set<Integer> cl2 = colores.keySet();
                    String n = colores.get(nombre);
                    for (Integer key : cl2){
                        Invertido.put(colores.get(n),key);
                        break;
                    }


            }

        }while(op!=0);
    }

    private static void rellenarHashMap() {
        int clave;
        String nombre;
        do{
            System.out.println("Introduce una clave: ");
            clave = in.nextInt();
            in.nextLine();

        }while (colores.containsKey(clave));
        System.out.println("Nombre");
        nombre = in.nextLine();
        if (clave>5){
            colores2.put(clave,nombre);
        }else {
            colores.put(clave, nombre);
        }
    }
}

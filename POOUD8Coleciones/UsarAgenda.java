package POOUD8Coleciones;

import java.util.ArrayList;
import java.util.Scanner;

public class UsarAgenda {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcion=0;
        do {
            Menu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1:
                    agenda.anadirContacto(new Contacto("Pepe","123141241241"));
                    agenda.anadirContacto(new Contacto("Maria","566656364346"));
                    break;
                case 2:
                    agenda.existeContacto(new Contacto("Pepe","123141241241"));
                    break;
                case 3:
                    System.out.println(agenda);
                    break;
                case 4:
                    break;
                case 5:
                    agenda.eliminaContacto(new Contacto("pepe",""));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error, Ningun digito es correcto.");
                    break;
            }

        }while (opcion!=7);
    }
    public static void Menu(){
        System.out.println("1.- Añadir Contacto");
        System.out.println("2.- Existe Contacto");
        System.out.println("3.- Listar Contacto");
        System.out.println("4.- Buscar Contacto");
        System.out.println("5.- Eliminar Contacto");
        System.out.println("6.- Salir");
    }
}



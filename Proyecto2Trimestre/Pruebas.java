package Proyecto2Trimestre;

import java.util.Scanner;

public class Pruebas {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        int opcion = 0;
        System.out.println("Elige una opción ");
        System.out.println("1) jugar jugador contra jugador ");
        System.out.println("2) salir");
        opcion = scanner.nextInt();
        do {
            switch (opcion) {
                case 1:
                    while (juego.quedanMovimientos()==true) {
                        System.out.println("Introduce un posión");
                        juego.mueveJugador1(scanner.nextInt());
                        System.out.println("Jugador 2 Introduce un posión");
                        juego.mueveJugador2(scanner.nextInt());
                        if (juego.ganaJugador1()==true){
                            break;
                        }
                    }
                case 2:
                    System.out.println("Adios");
                default:
                    System.out.println("Introduciste mal, Adios");
            }

        } while (opcion == 2);
    }
}

package Proyecto2Trimestre;

import java.util.Random;
import java.util.Scanner;

public class Pruebas {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        int opcion = 0;
        boolean jugada = true;
        int pos;
        do {
            System.out.println("Elige una opción ");
            System.out.println("1) jugar jugador contra jugador ");
            System.out.println("1) Jugar maquina vs maquina");
            System.out.println("2) salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    while (jugada) {
                        if (juego.quedanMovimientos()) {
                            do {
                                System.out.print("Introduce una posición (Jugador 1): ");
                                pos = scanner.nextInt();
                                if (!juego.movimientoValido(pos)) {
                                    System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                }
                            } while (!juego.movimientoValido(pos));

                            juego.mueveJugador1(pos);
                            if (juego.ganaJugador1()) {
                                System.out.println("Jugador 1 ha ganado");
                                jugada = false;
                            }
                        }
                        if (!juego.quedanMovimientos() && jugada) {
                            System.out.println("Es un empate!!!");
                            jugada = false;
                        }
                        if (juego.quedanMovimientos()) {
                            do {
                                System.out.print("Introduce una posición (Jugador 1): ");
                                pos = scanner.nextInt();
                                if (!juego.movimientoValido(pos)) {
                                    System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                }
                            } while (!juego.movimientoValido(pos));
                            if (juego.ganaJugador2()) {
                                System.out.println("Ha ganado jugador 2 ");
                                jugada = false;
                            }
                        }

                    }
                    System.out.println("Es un empate");
                case 2:
                    while (jugada) {
                        if (juego.quedanMovimientos()) {
                            do {
                                System.out.println("La Maquina (1) esta jugando: ");
                                pos = random.nextInt(9) + 1;
                                if (!juego.movimientoValido(pos)) {
                                    System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                }
                                if (!juego.quedanMovimientos()){
                                    break;
                                }
                            } while (!juego.movimientoValido(pos));
                            juego.mueveOrdenador1(pos);
                        }
                        if (juego.quedanMovimientos()){
                            do {
                                System.out.println("La Maquina (2) esta jugando: ");
                                pos = random.nextInt(9) + 1;
                                if (!juego.movimientoValido(pos)) {
                                    System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                }
                                if (!juego.quedanMovimientos()){
                                    break;
                                }
                            } while (!juego.movimientoValido(pos));
                            juego.mueveOrdenador2(pos);
                        }


                    }
                default:
                    System.out.println("Introduciste mal, Adios");
            }

        } while (opcion == 3);
    }
}

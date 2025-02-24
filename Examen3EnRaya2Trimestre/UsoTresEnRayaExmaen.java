package Examen3EnRaya2Trimestre;

import Proyecto2Trimestre.TresEnRaya;

import java.util.Random;
import java.util.Scanner;

public class UsoTresEnRayaExmaen {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        TresEnRayaExamen juego = new TresEnRayaExamen();
        int opcion = 0, contJ1 = 0, contJ2 = 0, contJ12Em = 0, opcion3, fichaElegida = 0;
        int pos = 0, contO1 = 0, contO2 = 0, contO12Em = 0, contIPartidas = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        juego.iniciar();
                        subMenu();
                        opcion3 = scanner.nextInt();
                        boolean jugada = true;
                        switch (opcion3) {
                            case 1:
                                System.out.println("Elige tu ficha");
                                System.out.println(" 1) 'X'\n" + "2) 'O'");
                                fichaElegida = scanner.nextInt();
                                juego.eligeFichero1(fichaElegida);
                                juego.eligeFichero2(fichaElegida);
                                while (jugada) {
                                    if (juego.quedanMovimientos() && !juego.ganaJugador2()) {
                                        do {
                                            System.out.print("Introduce una posición (Jugador 1): ");
                                            pos = scanner.nextInt();
                                            if (!juego.movimientoValido(pos)) {
                                                System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                            }
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());

                                        juego.mueveJugador1(pos);
                                        if (juego.ganaJugador1()) {
                                            System.out.println("Jugador 1 ha ganado");
                                            contJ1++;
                                            jugada = false;
                                        }
                                    }
                                    if (!juego.quedanMovimientos() && jugada) {
                                        System.out.println("Es un empate!!!");
                                        contJ12Em++;
                                        jugada = false;
                                    }
                                    if (juego.quedanMovimientos() && !juego.ganaJugador1()) {
                                        do {
                                            System.out.print("Introduce una posición (Jugador 2): ");
                                            pos = scanner.nextInt();
                                            if (!juego.movimientoValido(pos)) {
                                                System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                            }
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());
                                        juego.mueveJugador2(pos);
                                        if (juego.ganaJugador2()) {
                                            System.out.println("Ha ganado jugador 2 ");
                                            contJ2++;
                                            jugada = false;
                                        }
                                    }
                                    if (!juego.quedanMovimientos() && jugada) {
                                        System.out.println("Es un empate!!!");
                                        contJ12Em++;
                                        jugada = false;
                                    }

                                }
                                System.out.println("Es un empate");
                                break;
                            case 2:
                                while (jugada) {
                                    if (juego.quedanMovimientos() && !juego.ganaMaquina2()) {
                                        System.out.println("La maquina (1) esta jugando: ");
                                        do {
                                            pos = random.nextInt(9) + 1;
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());

                                        juego.mueveOrdenador1(pos);
                                        if (juego.ganaMaquina1()) {
                                            System.out.println("Maquina (1) ha ganado");
                                            contJ1++;
                                            jugada = false;
                                        }
                                    }
                                    if (!juego.quedanMovimientos() && jugada) {
                                        System.out.println("Es un empate!!!");
                                        contO12Em++;
                                        jugada = false;
                                    }
                                    if (juego.quedanMovimientos() && !juego.ganaMaquina1()) {
                                        System.out.println("La maquina (2) esta jugando: ");
                                        do {
                                            pos = random.nextInt(9) + 1;
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());

                                        juego.mueveOrdenador2(pos);
                                        if (juego.ganaMaquina2()) {
                                            System.out.println("Maquina (2) ha ganado");
                                            contJ2++;
                                            jugada = false;
                                        }
                                    }
                                    if (!juego.quedanMovimientos() && jugada) {
                                        System.out.println("Es un empate!!!");
                                        contO12Em++;
                                        jugada = false;
                                    }
                                }
                                break;
                            case 3:
                                juego.eligeFichero1(1);
                                juego.eligeFichero2(2);
                                while (jugada) {
                                    if (juego.quedanMovimientos() && !juego.ganaJugador2()) {
                                        do {
                                            System.out.print("Introduce una posición (Jugador 1): ");
                                            pos = scanner.nextInt();
                                            if (!juego.movimientoValido(pos)) {
                                                System.out.println("Posición inválida o ya ocupada, intenta de nuevo.");
                                            }
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());
                                        juego.mueveJugador1(pos);
                                        if (juego.ganaJugador1()) {
                                            System.out.println("Jugador 1 ha ganado");
                                            contJ1++;
                                            jugada = false;
                                        }
                                    }
                                    if (juego.quedanMovimientos() && !juego.ganaJugador1()) {
                                        do {
                                            System.out.println("La maquina (2) esta jugando: ");
                                            pos = random.nextInt(9) + 1;
                                        } while (!juego.movimientoValido(pos) && juego.quedanMovimientos());

                                        juego.mueveOrdenador2(pos);
                                        if (juego.ganaJugador2()) {
                                            System.out.println("Maquina (2) ha ganado");
                                            contO2++;
                                            jugada = false;
                                        }
                                    }
                                    if (!juego.quedanMovimientos() && jugada) {
                                        System.out.println("Es un empate!!!");
                                        contJ12Em++;
                                        jugada = false;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("¡Has Salido!");
                                opcion3 = 5;
                                break;
                            default:
                                System.out.println("Introduciste un numero mal");
                                break;

                        }
                        contIPartidas++;
                    } while (opcion3 != 5);
                    break;
                case 2:
                    int opcion1 = 0;
                    do {
                        System.out.println("1).Estadisticas jugador vs jugador");
                        System.out.println("2).Estadisticas maquina vs maquina");
                        System.out.println("3).Estadisticas jugador vs maquina");
                        System.out.println("4).Salir");
                        opcion1 = scanner.nextInt();
                        if (opcion1 == 1) {
                            estadisticasDeJugadores(contJ1, contJ2, contJ12Em, contIPartidas);
                        }
                        if (opcion1 == 2) {
                            mostrarEstadisicticasOrdenador(contJ1, contJ2, contO12Em, contIPartidas);
                        }
                        if (opcion1 == 3) {
                            estadisticasDeOrdendorYJugador(contJ1, contO2, contJ12Em, contIPartidas);
                        }
                        if (opcion1 == 4) {
                            System.out.println("¡Adios!");
                            opcion1 = 5;
                        }

                    } while (opcion1 != 5);
                    break;
                case 3:
                    System.out.println("Gracias por Salir");
                    break;

                default:
                    System.out.println("Introduciste mal, Adios");
                    break;
            }
        } while (opcion != 3);
    }

    public static void subMenu() {
        System.out.println("Elige una opción ");
        System.out.println("1) Jugar jugador contra jugador ");
        System.out.println("2) Jugar maquina vs maquina");
        System.out.println("3) Jugar jugador vs maquina");
        System.out.println("4) volver atras");
    }

    public static void estadisticasDeOrdendorYJugador(int contJ1, int contO2, int contJ12Em, int contIPartidas) {
        System.out.println("El Jugador ha ganado: " + contJ1);
        System.out.println("El Odenador ha ganado; " + contO2);
        System.out.println("El jugador y el ordenador han empatado: " + contJ12Em);
        System.out.println("Las partidas jugadas son: " + contIPartidas);
    }

    public static void estadisticasDeJugadores(int contJ1, int contJ2, int contJ12Em, int contIPartidas) {
        System.out.println("El Jugador (1) ha ganado: " + contJ1);
        System.out.println("El jugador (2) ha ganado: " + contJ2);
        System.out.println("Los Jugadores empatarón unas: " + contJ12Em);
        System.out.println("Las partidas jugadas son: " + contIPartidas);
    }

    public static void mostrarEstadisicticasOrdenador(int contO1, int contO2, int contO12Em, int contIPartidas) {
        System.out.println("El Ordenador (1) la ha ganado: " + contO1);
        System.out.println("El Ordenador (2) la ha ganado: " + contO2);
        System.out.println("Los ordenadores empatarón unas: " + contO12Em);
        System.out.println("Las partidas jugadas son: " + contIPartidas);
    }

    public static void mostrarMenu() {
        System.out.println("Elige una opción ");
        System.out.println("1) Entrar en los Modos de juego ");
        System.out.println("2) Mostrar estadisticas");
        System.out.println("3) Salir");
    }
}

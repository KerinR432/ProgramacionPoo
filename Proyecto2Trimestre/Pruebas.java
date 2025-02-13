package Proyecto2Trimestre;

import java.util.Scanner;

public class Pruebas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        juego.iniciar();
        juego.DibujaTablero();
        System.out.println("Introduce un nuemero: ");
        juego.mueveJugador1(scanner.nextInt());
    }
}

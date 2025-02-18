package Proyecto2Trimestre;

import java.util.Scanner;

public class UsarTresEnRaya {
    static Scanner in = new Scanner(System.in);
    static char[] tablero = new char[9];
    static int ganando1 = 0;
    static int ganando2 = 0;
    static int empate = 0;

    public static void main(String[] args) {
        /*Esto es el Main aqui he llado a todas las Funciones disposibles asi como inicializar las variables que he
        utilizado.
         */
        int pos2 = 0;
        int opción = 0;
        int pos1 = 0;
        /*Aqui esta el bucle que pedira que hacer con el 3 en raya asi como que seguira dando vueltas hasta
        salir de 3 en raya, ganar o mas funciones
         */

        do {
            System.out.println("1. Jugar una partida\n" + "2. Mostrar estadísticas\n" + "3. Salir\n" +
                    "Seleccione una opción:");
            opción = in.nextInt();

            if (opción == 1) {
                boolean jugando = true;
                iniciar();
                while (jugando) {
                    if (quedanCasillas()) {
                        System.out.println("mueve jugador 1");
                        pos1 = in.nextInt();
                        mueveJugador1(pos1);
                        if (ganaJugador1()) {
                            System.out.println("Has ganado!");
                            ganando1++;
                            jugando = false;

                        }
                    }
                    if (!quedanCasillas() && jugando) {
                        esEmpate();
                        jugando = false;
                    }
                    if (quedanCasillas() && jugando) {
                        System.out.println("Mueve jugador 2");
                        pos2 = in.nextInt();
                        mueveJugador2(pos2);
                        if (ganaJugador2()) {
                            System.out.println("Has ganado!");
                            ganando2++;
                            jugando = false;
                        }
                    }
                }
            }
            if (opción == 2) {
                muestraResultado();
            }
            if (opción > 3 || opción < 1) {
                System.out.println("Error, Introduce los digitos mencionados");
            }
        } while (opción != 3);

    }

    /*Aqui va la funcion de como mueve el jugador 1, entre ellos que se guarde en una posición la letra 'x'
     */
    public static void mueveJugador1(int pos) {
        if (movimientoValido(pos)) {
            tablero[pos - 1] = 'x';
            dibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
            mueveJugador1(in.nextInt());
        }
    }

    /*Aqui igual que arriba se guarda las veces que el jugar 2 mueve, tambien se me olvido mencionar que aparte de
    almacenar las letras y poner la 'o' tambien preguntamos a movimiento valido si se puede seguir jugando
     */
    public static void mueveJugador2(int pos) {
        if (movimientoValido(pos)) {
            tablero[pos - 1] = 'o';
            dibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
            mueveJugador2(in.nextInt());
        }
    }

    /*como he explicado arriba aqui esta función nos dira si el numero que introduzca el jugador 1 y jugador2
    puede introducirlo cuando no hay ningun numero
     */
    public static boolean movimientoValido(int pos) {

        if (pos >= 1 && pos <= 9) {
            return tablero[pos - 1] == ' ';
        }
        return false;
    }

    /*Aqui se inicializa el juego, limpiando el tablero y preparalo para tener todos los espacios vacios para comprobar
     si hay espacio
 */
    public static void iniciar() {
        int cont = 0;
        for (char i = '1'; i <= '9'; i++) {
            tablero[cont] = i;
            cont++;
        }

        dibujaTablero();
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = ' ';
        }
    }

    /*aqui deuvelve si hay casillas disponible para poder seguir jugando tambien aqui comrpuebo si el jugador 1 ha ganado
    o jugador 2
     */
    public static boolean quedanCasillas() {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == ' ') {
                return true;

            }
            if (ganaJugador1()) {
                return false;
            }
        }
        return false;

        /*aqui se dibuja el tablero mostrandole a jugador que teclas debe presionar, tambien se amacelan las 'x' o 'o'
        en el array
         */
    }

    public static void dibujaTablero() {
        System.out.println("-------------");
        System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
        System.out.println("-------------");
    }

    public static void muestraResultado() {
        System.out.println("Los empates son: " + empate);
        System.out.println("El Jugador 1 ha ganado:  " + ganando1);
        System.out.println("El Jugador 2 ha ganado: " + ganando2);

    }

    public static boolean esEmpate() {

        if (!quedanCasillas() && !ganaJugador1()) {
            System.out.println("Es Empate");
            empate++;
            return true;
        }
        return false;
    }


    /*aqui y el la siguiente función mostrarmos todas los distintos tipos de variciones que existe para que jugador 1 y
    jugador 2 gane haciendo muchas condicones para averiguiarlo
     */
    public static boolean ganaJugador1() {
        int Eganador1 = 0;
        if (tablero[0] == 'x' && tablero[1] == 'x' && tablero[2] == 'x') {
            return true;
        }
        if (tablero[0] == 'x' && tablero[3] == 'x' && tablero[6] == 'x') {
            return true;
        }
        if (tablero[0] == 'x' && tablero[1] == 'x' && tablero[2] == 'x') {
            return true;
        }
        if (tablero[2] == 'x' && tablero[5] == 'x' && tablero[8] == 'x') {
            return true;
        }
        if (tablero[2] == 'x' && tablero[4] == 'x' && tablero[6] == 'x') {
            return true;
        }
        if (tablero[0] == 'x' && tablero[4] == 'x' && tablero[8] == 'x') {
            return true;
        }
        if (tablero[1] == 'x' && tablero[4] == 'x' && tablero[7] == 'x') {
            return true;
        }
        if (tablero[6] == 'x' && tablero[7] == 'x' && tablero[8] == 'x') {
            return true;
        }
        if (tablero[3] == 'x' && tablero[4] == 'x' && tablero[5] == 'x') {
            Eganador1++;
            return true;
        }
        return false;
    }

    public static boolean ganaJugador2() {
        {

            if (tablero[0] == 'o' && tablero[1] == 'o' && tablero[2] == 'o') {
                return true;
            }
            if (tablero[0] == 'o' && tablero[3] == 'o' && tablero[6] == 'o') {
                return true;
            }
            if (tablero[0] == 'o' && tablero[1] == 'o' && tablero[2] == 'o') {
                return true;
            }
            if (tablero[2] == 'o' && tablero[5] == 'o' && tablero[8] == 'o') {
                return true;
            }
            if (tablero[2] == 'o' && tablero[4] == 'o' && tablero[6] == 'o') {
                return true;
            }
            if (tablero[0] == 'o' && tablero[4] == 'o' && tablero[8] == 'o') {
                return true;
            }
            if (tablero[1] == 'o' && tablero[4] == 'o' && tablero[7] == 'o') {
                return true;
            }
            if (tablero[6] == 'o' && tablero[7] == 'o' && tablero[8] == 'o') {
                return true;
            }
            return tablero[3] == 'o' && tablero[4] == 'o' && tablero[5] == 'o';

        }

    }
}

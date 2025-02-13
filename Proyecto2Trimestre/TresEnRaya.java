package Proyecto2Trimestre;

public class TresEnRaya {
    private int tablero[][] = new int[3][3];
    private int pos = 0;

    public TresEnRaya() {
        iniciar();
    }

    public void mueveJugador1(int pos) {
        if (movimientoValido(pos)) {
            tablero[pos - 1][pos -1]  =(char) 'X';
            DibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
        }
    }

    public void mueveJugador2(int pos) {

    }

    public boolean movimientoValido(int pos) {//averiguar si quedan movimiento válido...
        if (pos >= 1 && pos <= 9) {
            if (tablero[(pos - 1) / 3][(pos - 1) % 3] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean quedanMovimientos() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != ' ' ){
                    return true;
                }

            }
        }
        return false;
    }

    public boolean ganaJugador1() {
        return false;
    }

    public boolean ganaJugador2() {
        return false;
    }

    public void DibujaTablero() {//mostramos el tablero
        System.out.println("-----------------");
        System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
        System.out.println("-----------------");
        System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
        System.out.println("-----------------");
        System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
        System.out.println("-----------------");
    }

    //inicalizar el tablero
    public void iniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }

    }

}

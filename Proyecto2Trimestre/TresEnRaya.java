package Proyecto2Trimestre;

public class TresEnRaya {
    private int tablero[][]= new int[3][3];
    private int pos = 0;
    public  TresEnRaya(){
            iniciar();
    }
    public void mueveJugador1(int pos){

    }
    public void  mueveJugador2(int pos){

    }
    public boolean movimientoValido(int pos){//averiguar si quedan movimiento validos....
        if (pos >= 1 && pos <= 9) {
            if (tablero[(pos - 1)/3][(pos-1)%3] == ' ') {
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean quedanMovimientos(){

    }
    public boolean ganaJugador1(){

    }
    public boolean ganaJugador2(){

    }
    public void DibujaTablero(){//mostramos el tablero
        System.out.println("-------------");
        System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
        System.out.println("-------------");
    }
    //inicalizar el tablero
    public void iniciar() {
        int cont = 0;
        for (char i = '1'; i <= '9'; i++) {
            tablero[cont][cont] = i;
            cont++;
        }

}

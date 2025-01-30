package POOBasicoUD6;

import java.util.Random;

public class Password {
    private String pasword;
    private int longitud;

    public Password() {
        longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    //getters
    public String getPasword() {
        return pasword;
    }

    public int getLongitud() {
        return longitud;
    }

    //setters
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //metodos
    public boolean esFuerte() {
        int contador = 0;
        int contador2 = 0;
        if (minusculasYMayusculas(contador, contador2)) {
            return true;
        }
        if (longitudFuerte()) {
            return true;
        }
        return false;
    }

    private boolean longitudFuerte() {
        for (int i = 0; i < pasword.length(); i++) {
            if (pasword.charAt(i) == '0' && pasword.charAt(i) == '9') {
                return true;
            }

        }
        return false;
    }

    private boolean minusculasYMayusculas(int contador, int contador2) {
        for (int i = 0; i < longitud; i++) {
            if (pasword.charAt(i) >= 'a' && pasword.charAt(i) <= 'z') {
                contador++;
                if (contador >= 2) {
                    return true;
                }
            }
            if (pasword.charAt(i) >= 'A' && pasword.charAt(i) <= 'Z') {
                contador2++;
            }
        }
        return false;
    }

    public void generarPassword() {
        Random random = new Random();
        pasword = " ";
        for (int i = 0; i < longitud; i++) {
            pasword += random.nextInt(longitud);
            pasword += (char) (random.nextInt(('Z' + 1) - 'A') + 'A');
        }
    }
}

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
        String mayusculas = "ABCDFGHI";
        String minusculas = "abcdfghi";
        int contador = 0;
        int contador2 = 0;
        if (minusculasYMayusculas(mayusculas, contador, minusculas, contador2)) return true;
        return longitudFuerte();
    }

    private boolean longitudFuerte() {
        if (pasword.length() >= 10) {
            return true;
        }
        return false;
    }

    private boolean minusculasYMayusculas(String mayusculas, int contador, String minusculas, int contador2) {
        for (int i = 0; i < longitud; i++) {
            if (pasword.equals(mayusculas)) {
                contador++;
                if (contador >= 2) {
                    return true;
                }
            }
            if (pasword.equals(minusculas)) {
                contador++;
                if (contador2 > 1) {
                    return true;
                }
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

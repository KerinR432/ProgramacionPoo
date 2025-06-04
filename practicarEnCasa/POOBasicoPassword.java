package practicarEnCasa;

import java.util.Random;

public class POOBasicoPassword {
    private int longitud;
    private String contraseña;

    public POOBasicoPassword() {
        longitud = 8;
        contraseña = generarPassword(longitud);
    }

    public POOBasicoPassword(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword(longitud);
    }

    public boolean esFuerte() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "1234567890";
        int contNum = 0;
        int contlet = 0;
        if (contraseña.contains(letras+)) {
            contlet++;
            if (contraseña.contains(numeros)) {
                contNum++;
                return contlet > 2 && contNum > 5;
            }
        }
        return false;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String generarPassword(int longitud) {
        Random random = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String pass = " ";
        for (int i = 0; i <= longitud; i++) {
            pass += caracteres.charAt(random.nextInt(52));
            pass += random.nextInt(9) + 1;
        }
        return pass;
    }


}

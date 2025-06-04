package practicarEnCasa;

import java.util.Random;

public class POOBasicoPersona {
    private final int bajoPeso = -1, pesoIdeal = 0, sobrePeso = 1;
    private final String nombre;
    private final String DNI;
    private final int edad;
    private char sexo;
    private final char H = 'H', M = 'M';
    private double peso;
    private double altura;

    public POOBasicoPersona() {
        this.nombre = " ";
        this.DNI = generarDNI();
        this.edad = 0;
        this.sexo = H;
        this.altura = 0;
        this.peso = 0;
    }

    public POOBasicoPersona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.DNI = generarDNI();
        this.edad = edad;
        this.sexo = sexo;
        this.altura = 0;
        this.peso = 0;
    }

    public POOBasicoPersona(String nombre, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.DNI = generarDNI();
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public int CalcularIMC() {
        double rsdo = peso / (altura * altura);
        if (rsdo < 20) {
            return bajoPeso;
        }
        if (rsdo >= 20 && rsdo <= 25) {
            return pesoIdeal;
        }
        if (rsdo > 25) {
            return sobrePeso;
        }
        return bajoPeso;
    }

    public boolean esMayorDeEdad() {
        return edad > 18;
    }


    public void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = H;
        }
    }





    private String generarDNI() {
        Random random = new Random();
        String letra = "ABCDFGHIJKLMNOPQRSTUVWXYZ";
        String DNI = "" + letra.charAt(random.nextInt(26) + 1);
        for (int i = 0; i < 8; i++) {
            DNI += random.nextInt(9) + 1;
        }
        return DNI;
    }

    @Override
    public String toString() {
        return "POOBasicoPersona{" +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", H=" + H +
                ", M=" + M +
                ", peso=" + peso +
                ", altura=" + altura +
                ", pesoIdeal=" + CalcularIMC() +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

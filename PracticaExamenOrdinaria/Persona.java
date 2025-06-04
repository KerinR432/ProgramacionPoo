package PracticaExamenOrdinaria;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso, altura;
    private final int bajoPeso = -1;
    private final int pesoNormal = 0;
    private final int sobrePeso = 1;

    public Persona() {
        this.nombre = " ";
        this.edad = 0;
        this.DNI = generarDni();
        this.sexo = ' ';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String DNI, String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDni();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String DNI, String nombre, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDni();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double alt, double p) {
        double peso = (alt * alt) / p;
        if (peso < 20) {
            return bajoPeso;
        }
        if (peso > 20 && peso < 25) {
            return pesoNormal;
        }
        if (peso > 25) {
            return sobrePeso;
        }
        return 0;
    }

    public boolean esMayorDeEdad(int edad){
        if (edad>18){
            return true;
        }else {
            return false;
        }
    }
    public String generarDni(){
        String dni = " ";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            dni =" " + random.nextInt(8)+1;
        }
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getBajoPeso() {
        return bajoPeso;
    }

    public int getPesoNormal() {
        return pesoNormal;
    }

    public int getSobrePeso() {
        return sobrePeso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", bajoPeso=" + bajoPeso +
                ", pesoNormal=" + pesoNormal +
                ", sobrePeso=" + sobrePeso +
                '}';
    }
}

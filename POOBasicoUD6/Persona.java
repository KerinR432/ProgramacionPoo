package POOBasicoUD6;

import java.util.Random;

public class Persona {

    private String nombre, dni;
    private int edad;
    private char sexo;
    private double peso, altura;

    public Persona() {
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        generarDNI();
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
    }

    public int calcularImc() {
        int adecuado = 0;
        double resultado = 0;
        resultado = peso / (altura*altura);

        if (resultado < 20) {
            adecuado = -1;
        }
        if (resultado >= 20 || resultado <= 25) {
            adecuado = 0;
        }
        if (resultado > 25) {
            adecuado = 1;
        }
        return adecuado;
    }

    public static boolean esMayorDeEdad(int edad) {
        if (edad > 18) {
            return true;
        }
        return false;
    }

    private boolean comprobarSexo(char sexo) {
       sexo=Character.toLowerCase(sexo);
        if (sexo == 'H' || sexo == 'M') {
            this.sexo=sexo;
            return true;
        }
        this.sexo='H';
        return false;
    }

    public String toString() {
        return "Tu nombre: " + nombre + " tu edad: " + edad + " tu peso y atura: "
                + peso + " , " + altura +" DNI: "+dni+ " y tu sexo es: " + sexo;
    }

    private void generarDNI() {
        Random random = new Random();
        dni="";
        dni += (char) (random.nextInt(('Z' + 1) - 'A') + 'A');
        for (int i = 0; i < 8; i++) {
            dni += random.nextInt(10);
        }

    }
}

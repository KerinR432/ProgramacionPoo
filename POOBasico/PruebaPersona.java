package POOBasico;

import java.util.Random;

public class PruebaPersona {
    //constante
    public final int SOBREPESO = 1;
    public final int PESOIDEAL = 0;
    public final int BAJOPESO = -1;
    //atributos
    private String nombre, dni;
    private int edad;
    private char sexo;
    private double peso, altura;

    public PruebaPersona() {
        this.nombre = " ";
        generarDni();
        this.edad = 0;
        this.sexo = 'h';
        this.peso = 0;
        this.altura = 0;
    }

    public PruebaPersona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        generarDni();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    public PruebaPersona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
       generarDni();
        altura = 0;
        peso = 0;
    }

    //getters
    public String getNombre() {
        return nombre;
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

    public String getDni() {
        return dni;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public void generarDni() {
        Random random = new Random();
        //aqui falta generar el dni automaticamente
        String dni = " ";
        for (int i = 0; i < 8; i++) {
            int numAle=random.nextInt(10);
            dni+=numAle;
        }
        String letras="TRWAGMYFPDXBNJZQVHLCKE";
        int dniEntero=Integer.parseInt(dni);
        int resto=dniEntero%23;
        dni+=letras.charAt(resto);
        this.dni=dni;
    }

    //metodos
    @Override
    public String toString() {
        return "PruebaPersona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int calculaIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        }
        if (imc >= 25) {
            return 1;
        }
        return 0;
    }
    public boolean esMayorDeEdad(){
        return edad>=18;
        //return (edad>=18)?true:false;//tercnario
    }
}

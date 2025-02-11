package TareaEvaluable;

public class Persona {
    private String dni;
    private String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }


    //toString
    public String toString() {
        return " La persona se llama: " + nombre + ", " + " Tiene el DNI: " + dni;
    }
}

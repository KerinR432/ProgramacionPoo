package TareaEvaluable;

public class Persona {
    private String dni;
    private String nombre;

    public Persona() {
        this.dni = " ";
        this.nombre = " ";
    }

    //getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //toString
    public String toString() {
        return " La persona se llama: " + nombre + ", " + " Tiene el DNI: " + dni;
    }
}

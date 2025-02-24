package POOAvanzadoUD7;

public class Empleado {
    private String nombre, apellido, numSeguridadS;
    private double salarioBase;

    public Empleado(String nombre, String apellido, String numSeguridadS, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSeguridadS = numSeguridadS;
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumSeguridadS() {
        return numSeguridadS;
    }
    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumSeguridadS(String numSeguridadS) {
        this.numSeguridadS = numSeguridadS;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numSeguridadS='" + numSeguridadS + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

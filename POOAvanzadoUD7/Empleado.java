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

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
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

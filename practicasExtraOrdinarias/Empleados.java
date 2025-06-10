package practicasExtraOrdinarias;

public class Empleados {
    private String nombre;
    private int edad;
    private double salario;
    private final double PLUS = 300;

    public Empleados() {
        this.nombre = " ";
        this.edad = 0;
        this.salario = 0;
    }

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public double getPLUS() {
        return PLUS;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "PLUS=" + PLUS +
                ", salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

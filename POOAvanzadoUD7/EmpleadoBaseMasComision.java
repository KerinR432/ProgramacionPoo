package POOAvanzadoUD7;

public class EmpleadoBaseMasComision extends Empleado {
    double comisionVentas;
    int numeroVentas;
    public EmpleadoBaseMasComision(String nombre, String apellido, String numSeguridadS, double salarioBase,double comisionVentas,int numeroVentas) {
        super(nombre, apellido, numSeguridadS, salarioBase);
        this.comisionVentas=comisionVentas;
        this.numeroVentas=numeroVentas;
    }

    @Override
    public double getSalario() {
        return super.getSalarioBase()+(numeroVentas*comisionVentas);
    }

    @Override
    public String toString() {
        return super.toString()+ "EmpleadoBaseMasComision{" +
                "comisionVentas=" + comisionVentas +
                ", numeroVentas=" + numeroVentas +
                ", Salario Final=" + getSalarioBase() +
                '}';
    }
}

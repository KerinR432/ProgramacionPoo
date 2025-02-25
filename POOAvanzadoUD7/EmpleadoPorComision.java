package POOAvanzadoUD7;

public class EmpleadoPorComision extends Empleado{
        private double numeroVentas,comisionVentas,Salario;

    public EmpleadoPorComision(String nombre, String apellido, String numSeguridadS, int numeroVentas, int comisionVentas) {
        super(nombre, apellido, numSeguridadS, 0);
        this.numeroVentas = numeroVentas;
        this.comisionVentas = comisionVentas;
    }
    public double getSalario(){
        return((numeroVentas*comisionVentas));
    }

    /**
     * @return mostrando los atributos de empleado
     */
    @Override
    public String toString() {
        return super.toString()+ "EmpleadoPorComision{" +
                "numeroVentas=" + numeroVentas +
                ", comisionVentas=" + comisionVentas +
                ", Salario Final=" + getSalario() +
                '}';
    }
}

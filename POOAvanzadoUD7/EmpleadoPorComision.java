package POOAvanzadoUD7;

public class EmpleadoPorComision extends Empleado{
        private double numeroVentas,comisionVentas,Salario;

    public EmpleadoPorComision(String nombre, String apellido, String numSeguridadS, int numeroVentas, int comisionVentas) {
        super(nombre, apellido, numSeguridadS, 0);
        this.numeroVentas = numeroVentas;
        this.comisionVentas = comisionVentas;
    }
    public void setSalarioComision(){
        Salario=((numeroVentas*comisionVentas));
    }

    /**
     * @return mostrando los atributos de empleado
     */
    @Override
    public String toString() {
        return "EmpleadoPorComision{" +
                "numeroVentas=" + numeroVentas +
                ", comisionVentas=" + comisionVentas +
                ", Salario=" + Salario +
                '}';
    }
}

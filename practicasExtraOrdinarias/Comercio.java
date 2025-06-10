package practicasExtraOrdinarias;

public class Comercio extends Empleados{
    private double comision;

    public Comercio(double comision) {
        this.comision = comision;
    }

    public Comercio(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double Salario(){
       if (getEdad()>30 && getComision()>200){
           return getSalario()+getComision()+getPLUS();
       }
       return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comercio{");
        sb.append("comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }
}

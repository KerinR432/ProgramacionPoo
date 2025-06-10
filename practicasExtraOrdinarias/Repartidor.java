package practicasExtraOrdinarias;

public class Repartidor extends Empleados{
    private String zona;

    public Repartidor(String nombre,int edad,double salario,String zona){
        super(nombre, edad, salario);
        this.zona = zona;
    }


    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double Salario(){
        if (getEdad()>25 && getZona().equalsIgnoreCase("zona 3")){
            return getSalario()+ getPLUS();
        }
        return getSalario();
    }


    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                "} " + super.toString();
    }
}

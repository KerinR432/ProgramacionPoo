package practicasExtraOrdinarias;

public class EventoTaller extends Evento{
    private double costoPorMaterial;
    private int duracionHoras;
    public EventoTaller(String nombre,String fecha,double costoPorMaterial,int duracionHoras){
        super(nombre, fecha);
        this.costoPorMaterial = costoPorMaterial;
        this.duracionHoras = duracionHoras;
    }

    @Override
    public double calcularCosto() {
        return ((costoPorMaterial*super.getParticipantes().size())+(100*duracionHoras));
    }
}

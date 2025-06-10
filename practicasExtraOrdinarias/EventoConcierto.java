package practicasExtraOrdinarias;

public class EventoConcierto extends Evento{
    private double costoFijo;
    private double costoPorAsistente;
    public EventoConcierto(String nombre,String fecha,double costoFijo,double costoPorAsistente){
        super(nombre, fecha);
        this.costoFijo = costoFijo;
        this.costoPorAsistente = costoPorAsistente;
    }

    public double calcularCosto() {
        return ((costoFijo+costoPorAsistente)*super.getParticipantes().size());
    }
}

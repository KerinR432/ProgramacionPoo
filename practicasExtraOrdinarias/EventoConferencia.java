package practicasExtraOrdinarias;

public class EventoConferencia extends Evento{
    private double costoAsistente;
    private int numeroPonetes;
    public EventoConferencia(String nombre,String fecha,double costoAsistente, int numeroPonetes){
        super(nombre, fecha);
        this.costoAsistente = costoAsistente;
        this.numeroPonetes = numeroPonetes;
    }
    public double calcularCosto() {
        return ((costoAsistente*super.getParticipantes().size())+(500*numeroPonetes));
    }
}

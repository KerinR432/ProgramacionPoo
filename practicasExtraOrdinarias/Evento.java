package practicasExtraOrdinarias;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private final String nombre;
    private final String fecha;
    private final ArrayList<Participante>participantes;
    protected Evento(String nombre,String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
        participantes = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public String getFecha(){
        return fecha;
    }

    public List<Participante> getParticipantes(){
        return participantes;
    }

    public void agregarParticipante(Participante participante){
        participantes.add(participante);
    }

    public abstract double calcularCosto();

    public String toString(){
        return "[Nombre: "+nombre+"]\n"+"[Fecha: "+fecha+"]\n"+"[Los participantes son :"+participantes.size();
    }
}

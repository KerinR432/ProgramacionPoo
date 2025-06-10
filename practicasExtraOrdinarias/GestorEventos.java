package practicasExtraOrdinarias;

import java.util.ArrayList;

public class GestorEventos {
    private ArrayList<Evento>eventos;
    public GestorEventos(){
        eventos = new ArrayList<>();
    }

    public void registrarEvento(Evento evento){
        eventos.add(evento);
    }

    public void generarReporte(){
        for (Evento evento : eventos) {
            System.out.println("Los Eventos son :" + evento + "\n coste total es: " + evento.calcularCosto());
        }
    }
}

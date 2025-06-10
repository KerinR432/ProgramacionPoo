package practicasExtraOrdinarias;

public class UsoEvento {
    public static void main(String[] args) {
        Participante p1 = new Participante("Kerin","k@gmial.com");
        Participante p2 = new Participante("pepe","pepe@gmial.com");
        Participante p3 = new Participante("larry","larry@gmial.com");

        EventoConferencia v1 = new EventoConferencia("JavaCod","2023-07-15",15,250);
        EventoTaller v2 = new EventoTaller("Oleo","2023-08-10",150,5);
        EventoConcierto v3 = new EventoConcierto("RockStar","2023-09-01",100,69);

        v1.agregarParticipante(p1);
        v1.agregarParticipante(p2);
        v1.agregarParticipante(p3);

        v2.agregarParticipante(p1);
        v3.agregarParticipante(p3);

        GestorEventos evento = new GestorEventos();
        evento.registrarEvento(v1);
        evento.registrarEvento(v2);
        evento.registrarEvento(v3);

        evento.generarReporte();
    }
}

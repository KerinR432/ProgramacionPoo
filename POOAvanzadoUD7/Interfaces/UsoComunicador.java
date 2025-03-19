package POOAvanzadoUD7.Interfaces;

import java.util.ArrayList;

public class UsoComunicador {
    public static void main(String[] args) {
        ArrayList<Comunicador> coms = new ArrayList<Comunicador>();
        Comunicador com = ComunicadorManager.crearComunicador();
        //declaramos los objetos en un ArrayList
        coms.add(com);
        com=ComunicadorManager.crearComunicador();
        coms.add(com);
        //enviamos el mensaje
        for (Comunicador c:coms){
            c.enviaMensaje("Hola");

        }
    }
}

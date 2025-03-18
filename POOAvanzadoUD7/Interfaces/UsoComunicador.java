package POOAvanzadoUD7.Interfaces;

import java.util.ArrayList;

public class UsoComunicador {
    public static void main(String[] args) {
        ArrayList<Comunicador> coms = new ArrayList<Comunicador>();
        //declaramos los objetos en un ArrayList
        coms.add(new PalomaMensajera("Mensajera",true,"gris",30));
        coms.add(new TelefonoMovil("6666666","nokia"));
        //enviamos el mensaje
        for (Comunicador c:coms){
            c.enviaMensaje("Hola");

        }
    }
}

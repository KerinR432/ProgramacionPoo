package POOUD8Coleciones;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> agendaContacto;

    public Agenda() {
        agendaContacto = new ArrayList<Contacto>();
    }

    public boolean anadirContacto(Contacto c) {
        if (existeContacto(c)) return false;
        agendaContacto.add(c);
        return true;
    }

    public boolean existeContacto(Contacto contactoAnadir) {
        for (Contacto c : agendaContacto) {
            if (contactoAnadir.getNombre().equalsIgnoreCase(c.getNombre())) {
                return true;
            }

        }
        return false;
    }

    public void listarContacto() {
        System.out.println(this.toString());
    }

    public Contacto buscarContacto(String nombre) {
        for (int i = 0; i < agendaContacto.size(); i++) {
            Contacto c = agendaContacto.get(i);
            if (agendaContacto.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }

        }
        return null;
    }

    public boolean eliminaContacto(Contacto c) {
        if (!existeContacto(c)) {
            return false;
        }
        for (int i = 0; i < agendaContacto.size(); i++) {
            if (c.getNombre().equalsIgnoreCase(c.getNombre())) {
                agendaContacto.remove(i);
            }
        }
        return true;
    }

    public String toString() {
        String cad = " ";
        for (Contacto c : agendaContacto) {
            cad += c.toString() + "-\n";
        }
        return cad;
    }
}

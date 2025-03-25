package ProyectoBarajas;

import java.util.ArrayList;
import java.util.Random;
//creamos la clase baraja
public class Baraja {
    //inicalizamos las variables de esta clase.
    private Carta lista_cartas;

    //creamos un constructor vacio
    public Baraja() {

    }

    // creamos otro constructor con un tipo de bajara
    public Baraja(int tipobaraja) {
        lista_cartas = new Carta();
        // creamos otro constructor esta ves con un boolean

        /**public void Barajar() {
            ArrayList<Carta> carta_barejada = new ArrayList<Carta>();
            Random random = new Random();
            int tamañoCarta = carta_barejada.size();
            for (int i = 0; i < tamañoCarta; i++) {
                int indexCar = random.nextInt(lista_cartas.size());
                carta_barejada.add(lista_cartas);
            }



        }*/
    }
}
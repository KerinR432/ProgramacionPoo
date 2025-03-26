package ProyectoBarajas;

import java.util.ArrayList;
import java.util.Random;
//creamos la clase baraja
public class Baraja {
    //inicializamos las variables de esta clase.
    private ArrayList<Carta> lista_cartas;
    private ArrayList<Carta> id_cartas;

    //creamos un constructor vació
    public Baraja() {

    }

    // creamos otro constructor con un tipo de baraja
    public Baraja(int tipobaraja) {
        lista_cartas = new ArrayList<Carta>(tipobaraja);
    }
        // creamos otro constructor esta vez con un boolean
    public Baraja(int tipobaraja,boolean barajar){
        lista_cartas = new ArrayList<Carta>(tipobaraja);

    }
    //mezclar de manera aleatoria las barajas.
    public void Barajar(){
        ArrayList<Carta> carta_barejada = new ArrayList<Carta>();
        Random random = new Random();
        int tamCarta = carta_barejada.size();
        for (int i = 0; i < tamCarta; i++) {
            int indexCar = random.nextInt(tamCarta);
            carta_barejada.add(lista_cartas.get(indexCar));
            lista_cartas.remove(indexCar);
        }
        lista_cartas = carta_barejada;
    }

    public void Cortar(int posicion){
        for (int i = 0; i < posicion; i++){
            lista_cartas.get(i);
        }
    }
    public Carta Robar(){
        return lista_cartas.remove(0);
    }
    public void InsertaCartaFinal(int id_carta){
    }
    public void InsertaCartaFinal(Carta c){

    }
    public  void InsertaCartaPricipio(int id_carta){

    }

}
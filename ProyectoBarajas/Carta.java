package ProyectoBarajas;

public class Carta {
    //declaramos las dos variables que tiene esta clasa, que es numero de carta y los palos de esa carta
    private int numero,palo;

    //creamos los constructores de la clase carta
    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }
    //creamos otro constructor pero en este caso vacio
    public Carta() {
        numero=0;
        palo=0;
    }
    //creamos los getters de esta clase
    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }

    public String NombreNumero(){
        String[] carta = {"as","dos","tres","cuatro","cinco","seis","siete","Caballo","Rey","sota"};
        return carta[numero-1];

    }
    public String NombrePalo(){
       String[] palo = {"oro","copa","espada","bastos"};
       return palo[this.palo];
    }
    public String  NombreDeCarta(){
        return NombreNumero()+NombrePalo();

    }

}

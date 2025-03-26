package ProyectoBarajas;

public class Carta {
    //declaramos las dos variables que tiene esta class, que es número de carta y los palos de esa carta
    private int numero,palo;

    //creamos los constructores de la clase carta
    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }
    //creamos otro constructor pero en este caso vacio
    public Carta(int id) {
        if (id%10==0){
            numero=id;
        }
        if (id%4==0){
            palo=id;
        }
    }
    //creamos los getters de esta clase
    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }
    //creamos un metodo que nos dara el no mombre de la carta que nos toca
    public String NombreNumero(){
        String[] carta = {"as","dos","tres","cuatro","cinco","seis","siete","Caballo","Rey","sota"};
        return carta[numero-1];

    }
    //este metodo nos devuelve un nombre del palo que elijamos.
    public String NombrePalo(){
       String[] palo1 = {"oro","copa","espada","bastos"};
       return palo1[palo -1];
    }
    //este metodo nos devuelve el nombre de la carta entera utilizando los otros dos metodos
    public String  NombreDeCarta(){
        return NombreNumero()+" de "+NombrePalo();

    }
    //este metodo nos servira para más adelante es para dar un valor al modo de juego tute
    public int ValorTute(){
        if(numero>=8){
            return numero-6;
        }
        if (numero ==1){
            return 11;
        }
        if(numero == 3){
            return 10;
        }
        return 0;
    }
    //este metodo nos sirvira para un futuro nos devuelve la puntuación del juego del Mus
    public  int ValorMus(){
        if (numero <=2){
            return 1;
        }
        if (numero == 3){
            return 10;
        }
        if (numero >=8){
            return 10;
        }
        return 0;
    }
    //este metodo nos servira un futuro para que nos devuelva la puntación en el juego de Siete y medio
    public double ValorSieteYMedio(){
        if(numero >= 8){
            return .50;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "numero= " + numero +NombreNumero() +
                ", palo= " + palo + NombrePalo()+ " La Carta es: " + NombreDeCarta() +"\n El Valor del Tute es: "
                +ValorTute()+"\n el valor en el mus es: "+ValorMus()+"\n el valor de Siete y  Medio es: "+ValorSieteYMedio();
    }
}

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
       String[] palo1 = {"oro","copa","espada","bastos"};
       return palo1[palo -1];
    }
    public String  NombreDeCarta(){
        return NombreNumero()+" de "+NombrePalo();

    }
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

    @Override
    public String toString() {
        return "numero= " + numero +NombreNumero() +
                ", palo= " + palo + NombrePalo()+ " La Carta es: " + NombreDeCarta() +"\n El Valor del Tute es: "
                +ValorTute()+"\n el valor en el mus es: "+ValorMus();
    }
}

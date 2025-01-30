package POOBasico;

public class pruebaUsopersona {
    public static void main(String[] args) {
        PruebaPersona p1= new PruebaPersona();
        if(p1.calculaIMC()==p1.PESOIDEAL){
            System.out.println("Peso Ideal");
        }
        if(p1.calculaIMC()==p1.SOBREPESO){
            System.out.println("Estas Gordo!");
        }
        if(p1.calculaIMC()==p1.BAJOPESO){
            System.out.println("Estas delgado bro");
        }
        System.out.println(p1);
    }
}

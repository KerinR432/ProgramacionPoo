public class coche {
    //atributos
    private int num_ruedas, num_puerta;
    private String color,motor,matricula;
    private double peso;
    //metodos constructor: Inicaliza el objeto cuando se crea
    public coche(){
        num_ruedas=4;
        num_puerta=5;
        color="rojo";
        motor="v8";
        matricula="abc55";
        peso=1000;
    }
    //métodos
    public void arrancar(){
        System.out.println("Arrancando el coche con matricula "+matricula);
    }
    public void acelerar(){
        System.out.println("Estas acelerando!!!");
    }
    //métodos getters
    public int dameNumRuedas(){
        return num_ruedas;
    }
    public String dameColor(){
        return color;
    }
    //Métodos setters
    public void cambiarColor(String nuevoColor){
        //cambiamos el valor del atributo "color" al nuevo valor que le pasamos por parametro

        color=nuevoColor;
    }
}


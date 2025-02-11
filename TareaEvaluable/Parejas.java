package TareaEvaluable;

public class Parejas {
    private Persona persona1;
    private Persona persona2;
    private Regalo regaloParaPersona1;
    private Regalo regaloParaPersona2;

    public Parejas(Persona persona1, Persona persona2) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        regaloParaPersona1 = new Regalo(" ",0," ");
        regaloParaPersona2 = new Regalo(" ",0," ");
    }

    //setters
    public void setRegaloParaPersona1(Regalo regalo) {
        this.regaloParaPersona1 = regalo;
    }

    public void setRegaloParaPersona2(Regalo regalo) {
        this.regaloParaPersona2 = regalo;
    }

    //metodos
    public double calcularCostoTotal() {
        double resultado = 0;
        resultado = regaloParaPersona1.getPrecio() + regaloParaPersona2.getPrecio();
        return resultado;

    }

    public String mostrarDetalles() {
        return " el nombre de las pesonas son: " + persona1.toString() + persona2.toString() + "\n" +
                "Descripción del Regalo: " + "\n" + regaloParaPersona1.getDescripcionR() + "\n" +
                "Descripción del Regalo: " + regaloParaPersona2.getDescripcionR() + "\n" +
                " Precio total es: " + calcularCostoTotal() + " € ";
    }

    public String toString() {
        return persona1.toString() + " " + persona2.toString() + "\n" + persona1.getNombre() +
                regaloParaPersona1 +
                "\n" + persona2.getNombre() + regaloParaPersona2.toString() + "\n" +
                " El precio total termina siendo de: " + calcularCostoTotal() + " € ";
    }
}

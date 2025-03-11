package POOAvanzadoUD7.Abstracto;

public class Circulo extends Figura {
    private  double radio;
    private  Punto p;


    public Circulo(String nombre, double radio, Punto p) {
        super(nombre);
        this.radio = radio;
        this.p = p;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double obtenerArea() {
        return Math.PI*(radio*radio);
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+ "Circulo{" +
                "radio= " + radio +
                 " el volumen es "+obtenerVolumen()+" el area es: "+obtenerArea()+
                '}';
    }
}

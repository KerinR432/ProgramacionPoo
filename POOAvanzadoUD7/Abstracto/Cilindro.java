package POOAvanzadoUD7.Abstracto;

public class Cilindro extends Figura {
    private double altura;
    private Circulo c;

    public Cilindro(String nombre, double altura, Circulo c) {
        super(nombre);
        this.altura = altura;
        this.c = c;
    }

    @Override
    public double obtenerArea() {
        return 2 * c.obtenerArea()+(altura*2*Math.PI*c.getRadio());
    }

    @Override
    public double obtenerVolumen() {
        return altura * c.obtenerVolumen();
    }

    @Override
    public String toString() {
        return super.toString()+ "Cilindro{" +
                "altura=" + altura +
                ", circulo1=" + c +"el volumen es "+obtenerVolumen()+" el area es: "+obtenerArea()+
                '}';
    }
}

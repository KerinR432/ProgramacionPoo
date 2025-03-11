package POOAvanzadoUD7.Abstracto;

public class Punto extends Figura {
    private double x,y;

    public Punto(String nombre, double x, double y) {
        super(nombre);
        this.x = x;
        this.y = y;
    }
    //setters


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    //getters


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double obtenerArea() {
        return 0;
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+ " Punto{" +
                "x= " + x +
                ", y= " + y +" el volumen es "+obtenerVolumen()+" el area es: "+obtenerArea()+
                '}';
    }
}

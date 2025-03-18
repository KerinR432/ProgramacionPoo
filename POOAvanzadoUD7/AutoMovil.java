package POOAvanzadoUD7;

public abstract class AutoMovil {
    private String matricula,color;
    private int year;
    private double precioDeCompra;

    public AutoMovil(String matricula, String color, int year, double precioDeCompra) {
        this.matricula = matricula;
        this.color = color;
        this.year = year;
        this.precioDeCompra = precioDeCompra;
    }

    //Getters

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrecioDeCompra() {
        return precioDeCompra;
    }
    //setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrecioDeCompra(double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }
    public abstract double calculaPrecio();
}

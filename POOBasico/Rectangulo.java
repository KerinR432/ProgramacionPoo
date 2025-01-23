package POOBasico;

public class Rectangulo {
    //atributos
    private double altura;
    private double base;
    private double aletorio;
    private  double area;

    //constructor
    public Rectangulo(double alt, double bas){
        base=bas;
        altura=alt;

    }
    //GETTERS
    public double dameArea(){
        return base*altura;
    }
    public double damePerimetro(){
       return (2*base)+(2*altura);
    }
    public double dameBase(){
        return base;
    }
    public double dameAltura(){
        return altura;
    }




}

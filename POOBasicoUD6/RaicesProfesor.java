package POOBasicoUD6;

public class RaicesProfesor {
    private double a,b,c;

    public RaicesProfesor(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return (b*b)-(4*a*c);
    }
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    public void obtenerRaiz(){
        System.out.println(-b/2*a);
    }
    public void obtenerRaices(){
        double discrim=getDiscriminante();
        double sol1=(-b+Math.sqrt(discrim)/2*a);
        double sol2=(-b-Math.sqrt(discrim)/2*a);
        System.out.println("Solucion 1..."+sol1);
        System.out.println("Solucion 2..."+sol2);
    }
    public void calcular(){
        if (tieneRaiz()){
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        }else{
            System.out.println("No tiene numero raiz relaes");
        }
    }
}

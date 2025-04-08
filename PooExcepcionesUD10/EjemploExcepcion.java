package PooExcepcionesUD10;

public class EjemploExcepcion {
    public static double divide(double a, double b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            //ponemos la Instrucción que peude lanzar una excepción
            System.out.println("El resultado es: "+divide(5,2));
            System.out.println("El resultado es: "+divide(5,0));

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}

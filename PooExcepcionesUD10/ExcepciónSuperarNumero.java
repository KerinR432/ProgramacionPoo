package PooExcepcionesUD10;

public class ExcepciónSuperarNumero {
    public static int multiplicarNumeros(double num1,double num2)throws ArithmeticException{
        //int rsdo = num2*num1;
        if (num1*num2>Integer.MAX_VALUE){
            throw new ArithmeticException("Tu numero supero el tamaño de bit");
        }
        return (int)(num1*num2);
    }
    public static void main(String[] args) {
        try {
            System.out.println("El resultado es: "+multiplicarNumeros(1001,1000));
            System.out.println("El resultado es: "+multiplicarNumeros(10000000,100000001));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}

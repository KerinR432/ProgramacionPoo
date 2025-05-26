package PooExcepcionesUD10;

public class UsoEdadNoEstaEnRango {

    public static void validarEdad(int edad)throws ExcepcionEdadNoEstaEnRango{
        if (edad<=0 || edad >=100){
            throw new ExcepcionEdadNoEstaEnRango("El rango esta por encima de 100 o por debajo de 0");

        }
    }
    public static void main(String[] args) {
       try {
           System.out.println("**********************");
           validarEdad(-1);
           System.out.println("**********************");
       } catch (ExcepcionEdadNoEstaEnRango e) {
           System.out.println("**********************");
           System.out.println(e.getMessage());
           System.out.println("**********************");
       }
    }
}

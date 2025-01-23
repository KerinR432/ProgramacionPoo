package POOBasicoUD6;

public class pruebaCuentas {
    public static void main(String[]args){
       Persona persona=new Persona("123a");
       persona.setAñadirCuentas(new Cuenta("001"));
       persona.getUnaCuenta(0).setAbonos(100);

        System.out.println(persona.toString());
    }
}

package POOBasicoUD6;

public class UsarPesona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Freddy",18,'h');
        Persona p3 = new Persona("Moha",21,"A918319",70,1.60,'h');
        System.out.println(p3.toString());
        System.out.println();
        System.out.println(p2.toString());

        System.out.println(p3.esMayorDeEdad(25));
        System.out.println(p3.calcularImc());
    }
}

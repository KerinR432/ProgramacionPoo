public class Person {
    private int dni;
    private String nombre;
    private static int id_sig = 1;

    public Person (String nombre){
        this.nombre = nombre;
        dni = id_sig;
        id_sig++;

    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}

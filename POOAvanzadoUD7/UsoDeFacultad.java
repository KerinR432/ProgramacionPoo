package POOAvanzadoUD7;

public class UsoDeFacultad {
    public static void main(String[] args) {
        Personas[] personas = new Personas[3];
        personas[0] = new Profesor("Pepe", "Grillo", "412141241", "Casado", "2000", 5, "5A");//objeto Anonimo
        personas[1] = new Estudiantes("Freddy", "Bernabeou", "321144", "Divorciado", "2025");
        //obejeto Instanceof Clase: devuelve true si el objeto es de la clase y false en caso de lo contrario.
        for (int i = 0; i < personas.length; i++) {
            //hacemos casting o forzado de tipo para hacer que la persona se comporte como estudiante
            // y asi poder acceder a sus metodos.
            if (personas[i] instanceof Estudiantes) {
                ((Estudiantes) personas[1]).setCurso("2026");
            }
            if (personas[i] != null) {
                System.out.println(personas[i].toString());
            }
        }
    }

}


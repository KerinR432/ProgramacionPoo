package POOAvanzadoUD7;

public class UsoAula {
    public static void main(String[] args) {
        Aula2 aulas = new Aula2(1,4,"Fisica");
        aulas.anadirEstudiante(new Estudiante("Freddy","22","Masculino",9));
        aulas.anadirEstudiante(new Estudiante("Moha","20","Masculino",8));
        aulas.anadirEstudiante(new Estudiante("Julian","21","Masculino",7));
        aulas.anadirEstudiante(new Estudiante("Andy","22","Masculino",5));
        aulas.asignarProfesor(new Prof("Paul","51","Masculino","Fisica"));
        if (aulas.darClases()){
            System.out.println("Se da clases");
        }else{
            System.out.println("No se da clases");
        }
        System.out.println(aulas.toString());
    }
}

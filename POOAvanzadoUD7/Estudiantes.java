package POOAvanzadoUD7;

public class Estudiantes extends Personas {
    private String curso;

    public Estudiantes(String nombre, String apellidos, String dni, String estadoCivil, String curso) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }
    //GETTERS

    public String getCurso() {
        return curso;
    }
    //SETTERS

    public void setCurso(String curso) {
        this.curso = curso;
    }
    //TOSTRING

    @Override
    public String toString() {
        return super.toString()+"\n"+"El curso del estudiante es: "+curso;
    }
}

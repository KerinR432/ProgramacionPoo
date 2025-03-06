package POOAvanzadoUD7;

import java.util.ArrayList;

public class Aula2 {
    private  int identificador,numeroMaxEs;
    private String materia;
    private ArrayList <Estudiante> estudiantes;
        private Prof profesor;
    public Aula2(int identificador,int numeroMaxEs,String materia){
        this.identificador=identificador;
        this.numeroMaxEs=numeroMaxEs;
        comprobarMateria(materia);
        this.estudiantes=new ArrayList<>();
    }
    public void comprobarMateria(String mat){
        String[] materias = {"Filosofia","Matematica","Fisica"};
        for (int i = 0; i < materias.length; i++) {
            if (materia.equalsIgnoreCase(materias[i])){
                materia=mat;
                return;
            }
        }
        this.materia="-";
    }
    public void asignarProfesor(Prof profesor){
        if (profesor.getMateria().equalsIgnoreCase(materia)){
            this.profesor=profesor;
        }else{
            System.out.println("El profesor no pertenece a esta materia");
        }
    }
    public void anadirEstudiante(Estudiante estudiantes1){
        if (estudiantes.size() < numeroMaxEs){
            estudiantes.add(estudiantes1);
        }
    }
    public boolean darClases(){
        if (profesor == null || profesor.falta()){
            System.out.println("No se puede dar clases, No hay profe");
        }
        int asitencias=0;

        for(Estudiante e:estudiantes){
            if(!e.falta()){
                asitencias++;
            }
        }
        if (asitencias<estudiantes.size()/2){
            System.out.println("No se puede dar clases, Falto la mitad de Clases");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aula2 " +
                "identificador= " + identificador +
                ", numeroMaxEs= " + numeroMaxEs +
                ", materia= " + materia + '\n' +
                ", estudiantes= " + estudiantes +
                ", profesor= " + profesor+" Este profesor: "+"\n"+"Este dia: "+darClases();
    }
}

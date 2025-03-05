package POOAvanzadoUD7;

import java.util.Random;

public class Prof extends SerHumano {
    private String materia;
    public Prof(String nombre, String edad, String sexo,String materia) {
        super(nombre, edad, sexo);
        comprobarMateria();
    }
    public void comprobarMateria(){
        String[] materias = {"Filosofia","Matematica","Fisica"};
        for (int i = 0; i < materias.length; i++) {
            if (materia.equalsIgnoreCase(materias[i])){
                this.materia=materia;
            }
        }
    }
    public boolean falta(){
        Random random = new Random();
        int num=random.nextInt(11);

        if (num <= 1){
            return false;
        }
        if (num > 1){
            return true;
        }
        return true;
    }
}

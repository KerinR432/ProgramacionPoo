package POOAvanzadoUD7;

import java.util.Random;

public class Estudiante extends SerHumano {
    private int calificacion;
    public Estudiante(String nombre, String edad, String sexo,int calificacion) {
        super(nombre, edad, sexo);
        this.calificacion=calificacion;
    }
    public boolean falta(){
        Random random = new Random();
        int num=random.nextInt(11);

        if (num < 5){
            return false;
        }
        if (num > 5){
            return true;
        }
        return true;
    }
}

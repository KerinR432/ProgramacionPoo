package POOBasico;

public class usoTiempoProfesor {
    public static void main(String[]args){
        TiempoProfesor tiempo=new TiempoProfesor(12,5,12);
        TiempoProfesor tiempo2=new TiempoProfesor(5);
        TiempoProfesor tiempo3=new TiempoProfesor(5,12);
        System.out.println(tiempo.formatoTiempo());
        System.out.println("Hola");
    }
}

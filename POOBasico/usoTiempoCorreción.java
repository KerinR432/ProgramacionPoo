package POOBasico;

public class usoTiempoCorreción {
    public static void main(String[]args){
        tiempoCorreción t1=new tiempoCorreción(12,59);
        System.out.println("la hora es: "+t1.formatoTiempo());
        t1.setMinutos(60);
        System.out.println("la hora es: "+t1.formatoTiempo());
    }
}

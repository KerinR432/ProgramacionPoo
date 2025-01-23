package POOBasico;

public class TiempoProfesor {
    private int horas;
    private int minutos;
    private int segundos;
    public TiempoProfesor(int h, int m, int s){
        if (h>0 && h<23){
            horas=h;
        }else{
            horas=0;
        }
        if (m>0 && m<59){
            minutos=m;
        }else{
            minutos=0;
        }
        if (s>0 && s<59){
            segundos=s;
        }else{
            segundos=0;
        }

    }
    public TiempoProfesor(int h, int m) {
        if (h > 0 && h < 23) {
            horas = h;
        } else {
            horas = 0;
        }
        if (m > 0 && m < 59) {
            minutos = m;
        } else {
            minutos = 0;
        }
        segundos=0;
    }
    public TiempoProfesor(int h) {
        if (h > 0 && h < 23) {
            horas = h;
        } else {
            horas = 0;
        }
        minutos=0;
        segundos=0;
    }


    //GETTERS
    public String formatoTiempo(){
        String formatoHrs;
        formatoHrs=""+horas+":"+minutos+":"+segundos;
        return formatoHrs;
    }
    //SETTER
    public void tenerHoras(int hrs){
        if (hrs>0 && hrs<23){
            horas=hrs;
        }else{
            horas=0;
        }
    }
    public void tenerMinutos(int min){
        if (min>0 && min<59){
            minutos=min;
        }else{
            minutos=0;
        }
    }
    public void tenerSegundos(int seg){
        if (seg>0 && seg<59){
            segundos=seg;
        }else{
            segundos=0;
        }
    }

}

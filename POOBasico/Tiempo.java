package POOBasico;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundo;
    public Tiempo(int H, int M, int S){
        horas=H;
        minutos=M;
        segundo=S;
    }
    //GETTERS
    public int dameHoras(){

        return horas;
    }
    public int dameMinutos(){

        return minutos;
    }
    public int dameSegundo(){

        return segundo;
    }
    public String dameTiempoFormato(){
        String resultadoHoras;
        resultadoHoras = horas+":"+minutos+":"+segundo;
        return resultadoHoras;
    }
    //SETTER
    public void tenerHoras(int hrs){
        horas=hrs;
    }
    public void tenerMinutos(int mins){
        minutos=mins;
    }
    public void tenerSegundos(int seg){
        segundo=seg;
    }
}

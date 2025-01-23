package POOBasico;

public class tiempoCorreción {
    //atributos
    private int hora,min,sg;
    //constructores
    /**parametro para introducir horas, minutos y segundos
        @param h "es hora maximo=23 minimo=0
        @param m "es minutos maximo=59 minimo=0
        @param s " es segundos maximo=59 minimo=0
    */
    public tiempoCorreción(int h, int m, int s){
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }
    public tiempoCorreción(int h, int m){
        setHoras(h);
        setMinutos(m);
        sg=0;
    }
    public tiempoCorreción(int h){
        setHoras(h);
        min=0;
        sg=0;
    }

    public void setHoras(int hrs){
        if (hrs>=0 && hrs<=23){
            hora=hrs;
        }else{
            hora=0;
        }
    }
    public void setMinutos(int mins){
        if (mins>=0 && mins<=59){
            min=mins;
        }else{
            min=0;
        }
    }
    public void setSegundos(int segs){
        if (segs>=0 && segs<=59){
            sg=segs;
        }else{
            sg=0;
        }
    }
    public String formatoTiempo(){
        String formatoHrs;
        formatoHrs=hora+":"+min+":"+sg;
        return formatoHrs;
    }
}

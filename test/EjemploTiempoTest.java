package test;

import POOBasico.Tiempo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EjemploTiempoTest {
    private static Tiempo t1 = new Tiempo(5,10,60);
    @Test
    public void exampleHourTrue(){
        int esperado = 5;
        int result = t1.dameHoras();
        Assert.assertEquals(esperado,result,1);
    }

    @Test
    public void exampleMinuteTrue(){
        int esperado = 10;
        int result = t1.dameMinutos();
        Assert.assertEquals(esperado,result,1);
    }


    @Test
    public void exampleSecTrue(){
        int esperado = 60;
        int result = t1.dameSegundo();
        Assert.assertEquals(esperado,result,1);
    }

    @Test
    public void formatTime(){
        String esperado = "5:10:60";
        String result = t1.dameTiempoFormato();
        Assert.assertEquals(esperado,result);
    }
}

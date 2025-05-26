package TareaEvaluable;

import POOBasico.tiempoCorreción;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class tiempoCorreciónTest {

    @Test
    public void goodHour(){
        tiempoCorreción t1 = new tiempoCorreción(10);
        int wait = 10;
        tiempoCorreción result = t1;
        Assert.assertEquals(wait,result);
    }
}


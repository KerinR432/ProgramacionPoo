package POOBasico;

import java.util.Random;

public class PruebaRectangulo {
    public static void  main(String[]args){
        Random random=new Random();
        double ladoAle=random.nextDouble(10);
        Rectangulo figura=new Rectangulo(3,4);
        System.out.println(figura.dameArea()+" Area");
        System.out.println(figura.damePerimetro()+" Perimetro");
        //Mostrar segundo rectangulo
        Rectangulo figura2=new Rectangulo(ladoAle, figura.dameArea()/ladoAle);
        System.out.println(figura2.dameBase());
        System.out.println(figura2.dameAltura());
    }
}

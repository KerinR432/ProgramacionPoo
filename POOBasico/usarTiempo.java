package POOBasico;

import java.util.Scanner;

public class usarTiempo {
    public static void main(String[]args){
        int tHoras;
        int tMinutos;
        int tSegundos;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        tHoras=scanner.nextInt();
        System.out.println("Introduce los Minutos: ");
        tMinutos=scanner.nextInt();
        System.out.println("Introduce los segundos: ");
        tSegundos=scanner.nextInt();
        Tiempo tiempo=new Tiempo(tHoras,tMinutos,tSegundos);
        System.out.println(tiempo.dameHoras()+" hrs ");
        System.out.println(tiempo.dameMinutos()+" min ");
        System.out.println(tiempo.dameSegundo()+" s ");
        System.out.println(tiempo.dameTiempoFormato());
        System.out.println("Introduce una nueva hora");
        tiempo.tenerHoras(tHoras=scanner.nextInt());
        System.out.println("Introduce una nuevos minutos");
        tiempo.tenerMinutos(tMinutos=scanner.nextInt());
        System.out.println("Introduce una nuevos segundos");
        tiempo.tenerSegundos(tSegundos=scanner.nextInt());
        System.out.println(tiempo.dameTiempoFormato());

    }
}

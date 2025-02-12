/**
 * En el Día de San Valentín, queremos crear un programa que nos ayude a
 * gestionar los regalos que las parejas intercambian. Cada regalo tiene un
 * nombre, un precio y una descripción. Además, queremos representar a las
 * parejas, que estarán formadas por dos personas.
 */
package TareaEvaluable;

import java.util.Scanner;

public class GestorSanvalentin {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Persona p1 = new Persona("1214115F","Freddy");
        Persona p2 = new Persona("5636363X","Moha");
        Parejas pareja=new Parejas(p1,p2);
        pareja.setRegaloParaPersona1((new Regalo("movil",1500.67," ")));
        System.out.println(pareja.calcularCostoTotal());
        System.out.println(pareja.toString());


    }

}

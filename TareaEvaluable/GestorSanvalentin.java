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
        Regalo regalo1 = new Regalo();
        Regalo regalo2 = new Regalo();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.setNombre("Freddy");
        persona1.setDni("1214115F");
        persona2.setNombre("Moha");
        persona2.setDni("5636363X");
        regalo1.setNombreRegalo("Movil");
        regalo1.setPrecio(1500.67);
        regalo1.setDescripcionR("Es un movil para llamar y ver videos como hace otras cosas");
        regalo2.setNombreRegalo("portatil");
        regalo2.setPrecio(1960.67);
        regalo2.setDescripcionR("Es un portatil para los usos diarios de la persona");
        Parejas parejas1 = new Parejas(persona1, persona2);
        parejas1.setRegaloParaPersona2(regalo2);
        parejas1.setRegaloParaPersona1(regalo1);
        System.out.println(parejas1.mostrarDetalles());
        System.out.println();
        System.out.println(parejas1.toString());

    }

}

import java.util.Scanner;

public class usoCuenta {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int opciones = 0;
        //INTRODUCIR PRIMERO LOS DATOS
        System.out.println("Introduce un Titular: ");
        Cuenta bbva = new Cuenta(scanner.nextLine());
        System.out.println("El Titular es: " + bbva.getTitular());
        System.out.println("Introduce tu Cantidad de Dinero en la Cuenta: ");
        bbva.ingresar(scanner.nextDouble());
        //EL BUCLE DEL MENU
        do {
            //EL MENU
            System.out.println("¿Que quieres realizar?");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Salir del programa");
            opciones = scanner.nextInt();
            //EL SWITCH PARA ELEGIR LAS ACCIONES
            switch (opciones) {
                case 1:
                    // SUMAR LA CANTIDAD EXISTENTE POR UNA QUE SE METE POR PARAMETRO
                    System.out.println("Cuanto Dinero quieres ingresar: ");
                    bbva.ingresar(scanner.nextDouble());
                    System.out.println("El Titular es: " + bbva.getTitular());
                    System.out.println("El total del la cuenta es: " + bbva.getCantidad());
                    break;
                case 2:
                    //RESTAR LA CANTIDAD ACTUAL CON UNA QUE SE METE POR PARAMETRO O SI ES MAYOR DEJARLO A 0
                    System.out.println("Cuanto Dinero quieres retirar: ");
                    bbva.retirar(scanner.nextDouble());
                    System.out.println("El Titular es: " + bbva.getTitular());
                    System.out.println("El total de la cuenta es: " + bbva.getCantidad());
                    break;
                case 3:
                    //SALIR DEL BUCLE
                    break;
                default:
                    System.out.println("Saliste del programa correctamente");
                    break;
            }
        } while (opciones != 3);
        //SALIDA DEL BUCLE
        System.out.println("Saliste del programa correctamente");
    }
}

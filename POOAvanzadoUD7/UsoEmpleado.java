package POOAvanzadoUD7;

import java.util.Scanner;

public class UsoEmpleado {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        int cont = 0;
        int opcion = Menu();

        switch (opcion) {
            case 1:
                empleados[cont] = pideDatosDeEmpeladoPorComsion(empleados, cont);
                cont++;
                break;
            case 2:
                empleados[cont] = pideDatosDeEmpleadoBaseMasComsion();
                break;
            case 3:

            default:

        }
    }

    public static EmpleadoPorComision pideDatosDeEmpeladoPorComsion(Empleado[] empleados, int cont) {
        String nombre;
        String apellido;
        int comisonVentas;
        String numSss;
        int ventas;
        System.out.println("Introduce Datos del Empleado");
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        apellido = scanner.nextLine();
        System.out.println("NSS: ");
        numSss = scanner.nextLine();
        System.out.println("numero de Ventas: ");
        ventas = Integer.parseInt(scanner.nextLine());
        System.out.println("Comsión por venta: ");
        comisonVentas = Integer.parseInt(scanner.nextLine());

        return new EmpleadoPorComision(nombre, apellido, numSss, ventas, comisonVentas);
    }

    public static int Menu() {
        System.out.println("Que tipo de Empleado eres?");
        System.out.println("1. Empleado por comision");
        System.out.println("2. Empleado base más comsión");
        System.out.println("3. Salir");
        int opcion = Integer.parseInt(scanner.nextLine());
        return opcion;
    }

    public static EmpleadoBaseMasComision pideDatosDeEmpleadoBaseMasComsion() {
        String nombre;
        String apellido;
        double comisonVentas;
        String numSss;
        int ventas;
        double salarioBase;

        System.out.println("Introduce Datos del Empleado");
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        apellido = scanner.nextLine();
        System.out.println("NSS: ");
        numSss = scanner.nextLine();
        System.out.println("numero de Ventas: ");
        ventas = Integer.parseInt(scanner.nextLine());
        System.out.println("Comsión por venta: ");
        comisonVentas = Double.parseDouble(scanner.nextLine());
        System.out.println("Salario Base: ");
        salarioBase=Double.parseDouble(scanner.nextLine());
        return new EmpleadoBaseMasComision(nombre, apellido, numSss, comisonVentas, salarioBase, ventas);
    }
}

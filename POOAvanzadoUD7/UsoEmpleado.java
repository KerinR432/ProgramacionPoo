package POOAvanzadoUD7;

public class UsoEmpleado {
    public static void main(String[] args) {
       EmpleadoPorComision emp1 = new EmpleadoPorComision("Freddy","Bernabeu","131412414",10,5);
        System.out.println(emp1);
       System.out.println(emp1.getSalario());
        EmpleadoBaseMasComision emp2 = new EmpleadoBaseMasComision("Moha","Salami","13141145",100,10,5);
        System.out.println(emp2.getSalario());
    }
}

package POOBasicoUD6;

public class Persona2 {
    //atributos
    private String dni;
    //int[] nums
    private Cuenta[] misCuentas;

    public Persona2(String dni) {
        this.dni = dni;
        misCuentas = new Cuenta[3];

    }

    //GETTERS
    public boolean getSoyMorozo() {
        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i] != null) {
                if (misCuentas[i].getSaldo() < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public Cuenta getUnaCuenta(int num) {
        if (num<3){
        return misCuentas[num];
        }
        return null;
    }

    //SETTERS
    public void setAñadirCuentas(Cuenta newCuenta) {
        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i] == null) {
                misCuentas[i] = newCuenta;
                return;
            }
        }

    }
    public String toString(){
       String cadena="Dni: "+dni+" ";
        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i]!=null){
            cadena+=misCuentas[i].toString();
            }
        }
        return cadena;
    }
}

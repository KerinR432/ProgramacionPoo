package practicasExtraOrdinarias;

import POOBasicoUD6.Cuenta;

public class Persona {
    private int nCuenta = 0;
    private String DNI;
    private Cuentas[] cuentaBancaria;

    public Persona (String DNI){
        this.DNI = DNI;
        cuentaBancaria = new Cuentas[3];
    }

    public boolean esMoroso(){
        for (int i = 0; i < cuentaBancaria.length; i++) {
            if (cuentaBancaria[i].getSaldo() < 0){
                return true;
            }
        }
        return false;
    }

    public void añadirCuenta(Cuentas c){
        if (nCuenta < 2){
            cuentaBancaria[nCuenta] = c;
            nCuenta++;
        }
    }
}

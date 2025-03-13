package POOAvanzadoUD7.Interfaces;

public interface Comunicador {
    //en una interfaz solo puede haber
    //1. contanste(final static)
    public int CTE = 5;

    //2. todos los mentodos son abstracto no debemos ponerlo
    public void enviaMensaje(String mensaje);

}

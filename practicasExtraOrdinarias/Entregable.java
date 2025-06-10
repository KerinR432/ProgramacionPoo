package practicasExtraOrdinarias;

public interface Entregable {

    public void entregar(boolean prestado);
    public void devolver(boolean prestado);
    public boolean isEntregado(boolean prestado);
    public void compareTo(Object a);
}

package POOUD8Coleciones;

public class Contacto {
    private String nombre,telefono;
    public Contacto(String nombre,String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "El Nombre del Contacto es: "+nombre+"\n"+"Y su Numero de Telefono es: "+telefono;
    }
}


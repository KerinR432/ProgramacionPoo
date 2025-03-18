package POOAvanzadoUD7.Abstracto;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    //getters

    public String getNombre() {
        return nombre;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo abstracto
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || this == null) {
            return false;
        }
        return true;
    }
    public abstract double obtenerArea();
    public abstract double obtenerVolumen();



    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

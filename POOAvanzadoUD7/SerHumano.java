package POOAvanzadoUD7;

public class SerHumano {
    private String nombre, edad, sexo ;

    public SerHumano(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String toString() {
        return "El Nombre es: " + nombre + " \n" + "La Edad es: " + edad + "\n" + "Y su Sexo es: " + sexo;
    }
}


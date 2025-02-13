package POOAvanzadoUD7;

public class Personas {
    private String nombre,apellidos,dni,estadoCivil;

    public Personas(String nombre, String apellidos, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "El Nombre de la Persona es: "+nombre+"\n"+"El apellidos es :"+apellidos+"\n"+"El DNI es: "+dni+
                "\n"+"El estado Ciivil de esta persona es: "+estadoCivil;
    }
}


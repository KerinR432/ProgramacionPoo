package practicasExtraOrdinarias;

public class Participante {
    private String nombre;
    private String email;

    public Participante(String nombre,String email){
        this.nombre = nombre;
        this.email = email;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
}

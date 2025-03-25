package ClinicaVeterinaria;

public class Reptiles extends Animal{
    private String especie;
    private boolean venenosos;

    public Reptiles(String nombre,String especie,String fechaNacimiento,double peso, boolean venenosos,String comentarios) {
        super(nombre,fechaNacimiento,peso,comentarios);
        this.especie = especie;
        this.venenosos = venenosos;
    }

    @Override
    public String dameDatosAnimal() {
        return "nombre"+getNombre()+"\nLa especie es: "+especie+"\n Fecha de nacimiento es: "+getFechaNacimiento()+"\n su peso" +
                ": "+getPeso()+"\nel reptil es venenoso : "+venenosos+"\nComentarios: "+getComentarios();
    }
}

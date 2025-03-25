package ClinicaVeterinaria;

public class Pajaro extends Animal{
    private boolean cantor;
    private Especies especie;
    public enum Especies{Canario,Periquito,Agapornis};
    public Pajaro(String nombre,Especies especie,String fechaNacimiento,double peso, boolean cantor,String comentarios) {
        super(nombre,fechaNacimiento,peso,comentarios);
        this.especie = especie;
        this.cantor = cantor;
    }

    @Override
    public String dameDatosAnimal() {
        return "nombre"+getNombre()+"\nLa especie es: "+especie+"\n Fecha de nacimiento es: "+getFechaNacimiento()+"\n su peso" +
                ": "+getPeso()+"\nel pajaro es cantor : "+cantor+"\nComentarios: "+getComentarios();
    }
}

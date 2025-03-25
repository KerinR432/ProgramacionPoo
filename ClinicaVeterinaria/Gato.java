package ClinicaVeterinaria;

public class Gato  extends Animal{
    private String microchip;
    private Raza_gato raza;
    public enum Raza_gato{Comun, Siames, Persa, Angora, ScottishFold};
    public Gato(String nombre,Raza_gato raza,String fechaNacimiento,double peso, String microchip,String comentarios) {
        super(nombre,fechaNacimiento,peso,comentarios);
        this.raza = raza;
        this.microchip = microchip;
    }

    @Override
    public String dameDatosAnimal() {
        return "nombre"+getNombre()+"\nLa raza es: "+raza+"\n Fecha de nacimiento es: "+getFechaNacimiento()+"\n su peso" +
                ": "+getPeso()+"\nMicrochip: "+microchip+"\nComentarios: "+getComentarios();
    }
}

package ClinicaVeterinaria;

public class Perro extends Animal {
    private String microchip;
    private Raza raza;
    public enum Raza{PastorAleman,Husky,FoxTerrier};
    public Perro(String nombre,Raza raza,String fechaNacimiento,double peso, String microchip,String comentarios) {
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

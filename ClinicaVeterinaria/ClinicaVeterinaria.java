package ClinicaVeterinaria;

import java.util.ArrayList;

public class ClinicaVeterinaria {
    private ArrayList<Animal> lista_animales;
    public ClinicaVeterinaria(){
        lista_animales = new ArrayList<Animal>();
    }

    public void insertarAnimal(Animal animal){
        lista_animales.add(animal);
    }

    public Animal buscarAnimal( String nombres){
        for (Animal animales:lista_animales) {
            if (lista_animales.equals(nombres)){
                return animales;
            }
        }
        return null;
    }

    public boolean modificarComentarioAnimal( String nombres,String comentario){
        Animal animalEcontrado = buscarAnimal(nombres);
        if (animalEcontrado == null){
            return false;
        }
        animalEcontrado.setComentarios(comentario);
        return true;
    }

    @Override
    public String toString() {
        String datos="";
        for(int i = 0; i< lista_animales.size();i++){
            datos+=lista_animales.get(i).dameDatosAnimal()+"\n";
        }
        return datos;
    }
}

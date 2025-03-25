package ClinicaVeterinaria;
import java.util.ArrayList;
import ClinicaVeterinaria.Perro.Raza;
import ClinicaVeterinaria.Gato.Raza_gato;
public class UsoClinicaVeterinario {
    public static void main(String[] args) {
        ClinicaVeterinaria c1 = new ClinicaVeterinaria();
        c1.insertarAnimal(new Perro("San", Raza.PastorAleman,"12-02-2002",43,"12313124141","cojea"));
        c1.insertarAnimal(new Gato("miss", Raza_gato.Siames,"12-05-2005",25,"123141424","infeción"));
        c1.insertarAnimal(new Pajaro("Mickey", Pajaro.Especies.Agapornis,"5-02-2005",12,false,"Pico dañado"));
        System.out.println(c1.toString());
    }
}

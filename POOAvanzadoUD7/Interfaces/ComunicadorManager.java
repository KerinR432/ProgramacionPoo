package POOAvanzadoUD7.Interfaces;

//programamos el patron de Diseño creacional: Factory Method
//son soluciones estandar a problemas recurrende
//"sirven para no reinvitar la rueda"
public class ComunicadorManager {
    public static Comunicador crearComunicador(){
        //return new PalomaMensajera();
        //la tecnologia avanza a telegrafo
        //return new Telegrafo();
        //la tecnologia avanza y aparece el el telefono
        return new TelefonoMovil();
    }

}

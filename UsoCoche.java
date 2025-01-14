public class UsoCoche {
    public static void main(String[]args){
        //NombreClase|nombreObjeto|reserbarMemoriaRAM|new=MetodoConstructor
        coche renualt=new coche();
        //usamos el Objeto
        //nombreOnjeto.metodo(parametros)
        renualt.arrancar();
        renualt.cambiarColor("Negro");
        System.out.println(renualt.dameNumRuedas());
        System.out.println(renualt.dameColor());

    }
}

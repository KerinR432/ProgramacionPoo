package PooExcepcionesUD10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficherosDeTexto {
    public static void main(String[] args) {
        try {
            copiaFicheroDeTexto("fichero.txt","ficherocopia.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void copiaFicheroDeTexto(String ficheroOrigin,String ficheroDestino) throws IOException {
        //primero leo el fichero origen
        FileReader entrada;
        entrada = new FileReader("fichero.txt");
        String contenidoFichero="";
       int car = 0;
        while(car!=-1){
            car = entrada.read();
            contenidoFichero+=(char)car;


        }
        entrada.close();
        //ahora lo escribo
        FileWriter salida2 = new FileWriter(ficheroDestino);
        salida2.write(contenidoFichero);
        salida2.close();
    }
}

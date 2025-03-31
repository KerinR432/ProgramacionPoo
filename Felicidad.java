public class Felicidad {
    public static void main(String[] args) {
        int felicidad = 0;

        boolean regaloInesperado = true;
        boolean diaConAmigos = true;

        if (regaloInesperado) {
            felicidad += 10;
            System.out.println("Un regalo inesperado me da felicidad ");
        }

        if (diaConAmigos) {
            felicidad += 20;
            System.out.println("Un día con amigos me genera el doble de felicidad");
        }

        while (felicidad > 0) {
            System.out.println("Mientras sea feliz, mis días brillan ");
            felicidad--;
        }
    }
}

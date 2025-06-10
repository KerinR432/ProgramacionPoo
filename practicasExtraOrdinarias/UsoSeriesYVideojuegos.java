package practicasExtraOrdinarias;

public class UsoSeriesYVideojuegos {
    public static void main(String[] args) {
        Videojuegos[] juegos = new Videojuegos[5];
        Serie[] series = new Serie[5];
        int contardor = 0;
        juegos[0]=new Videojuegos("TitalFall",12,"Shooter","Respawn");
        series[0] = new Serie("Casa de papel","miguel osoria");
        juegos[1] = new Videojuegos("Zelda",22);
        series[1] = new Serie("Wind Dead",3,"Thiller","Myukix");

        juegos[0].entregar(true);
        series[1].entregar(true);

        for (int i = 0; i < 5; i++) {
            System.out.println(juegos[i]);
            System.out.println(series[i]);
        }
    }
}

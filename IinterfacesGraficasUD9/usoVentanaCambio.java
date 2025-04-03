package IinterfacesGraficasUD9;

public class usoVentanaCambio {
    public static void main(String[] args) {
       VentanitaCambioVen cv = new VentanitaCambioVen();

       VentanitaCambioVen2 cv2 = new VentanitaCambioVen2();

       cv.setVentanaSecundaria(cv2);
       cv2.setVetanaPrincipal(cv);


    }
}

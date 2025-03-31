package IinterfacesGraficasUD9;
//es mas practico tener pequetes separados
import javax.swing.*;

public class Vetana_1 {
    public static void main(String[] args) {
        //creamos la ventana
        JFrame ventana = new JFrame("Mi primera ventana");
        //1. Una ventana inicialmente tine tamaño 0
        ventana.setSize(400,400 );//--> esto es ancho y alto en px
        ventana.setLocation(0,0); //--> esto es posición en la ventaja en px
        //2. Una ventana hay que indicarle el comportamiento al pulsar el aspa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Dibujamos el resto de Elementos
        //Creamos una lamina
        JPanel lamina = new JPanel();
        //Vincular el panel con la vetana
        ventana.setContentPane(lamina);
        //creamo una etiqueta
        JLabel et1=new JLabel("Nombre");
        //Vinculamos la etiqueta con la lamina
        lamina.add(et1);
        //Ahora lo mismo pero con JtextField
        JTextField campo = new JTextField(10);
        //vinculamos a la lamina
        ventana.add(campo);
        //ahora lo mismo pero con Jbutton
        JButton btn1 = new JButton("Saludar");
        ventana.add(btn1);
        //3. Que por defecto una ventana aparece invisible, hay que hacerla visible si queremos que se muestre.
        ventana.setVisible(true);//--> ESTO IMPORTANTE QUE SEA LO ULTIMO

    }
}

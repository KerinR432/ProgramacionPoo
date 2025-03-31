package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaHistoria extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel et1,et2,et3;
    private JTextField campo1,campo2,campo3;
    private JTextArea historia;
    private JButton crearH;

    public VentanaHistoria(){
        super("Una Maravillosas Historia");
        this.setBounds(0,0,350,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        crearVentana();
        this.setVisible(true);
    }
    //Un constructor Para  crear el Lienzo
    private void crearVentana(){
        panel = new JPanel();

        et1 = new JLabel("Nombre");
        panel.add(et1);
        campo1 = new JTextField(10);
        panel.add(campo1);

        et2 = new JLabel("Apellido");
        panel.add(et2);
        campo2 = new JTextField(10);
        panel.add(campo2);

        et3 = new JLabel("Lugar");
        panel.add(et3);
        campo3 = new JTextField(10);
        panel.add(campo3);

        crearH = new JButton("Vive tu historia");
        panel.add(crearH);

        historia = new JTextArea("");
        panel.add(historia);
        crearH.addActionListener(this);


        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = campo1.getText();
        String Apellido = campo2.getText();
        String Ciudad = campo3.getText();

        historia.setText("En el año 2450, el Imperio Español se erige como una superpotencia en el mundo de acero y vapor. A través de una tecnología avanzada que se fusiona con las viejas tradiciones\n," +
                " el imperio ha logrado colonizar nuevos territorios, desde las alturas de los Andes hasta las fronteras del desierto de Sahara. Los antiguos barcos de guerra han sido reemplazados por gigantescos dirigibles de combate,\n" +
                " las espadas de acero por filosos y relucientes machetes de metal, y la vieja monarquía ha dado paso a un sistema imperial en el que el hierro y el vapor dictan el curso de la historia.\n" +
                "\n" +
                "Tu nombre es"+nombre + Apellido+" y acabas de ser aceptado en las filas de la Legión de Acero, la unidad más prestigiosa del Imperio. Tras años de estudiar el arte de la guerra, tanto en el campo como en las aulas, has llegado a la gran ciudad de"+ Ciudad+ ", la capital del imperio. Este lugar es una maravilla de la ingeniería: rascacielos que parecen fusionarse con las nubes, puentes colgantes de metal, y fábricas que emiten humo incesante, todo impulsado por poderosas máquinas de vapor. Los trenes que circulan por sus vías parecen serpientes de hierro, y los dirigibles patrullan el cielo como guardianes de una ciudad que nunca duerme.");

    }
}

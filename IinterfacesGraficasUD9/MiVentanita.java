package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentanita extends JFrame implements ActionListener {
    //Atributos
    private JPanel panel;
    private JLabel etq;
    private JTextField campo;
    private JButton botton;
    private JLabel etqSaludo;


    //Constructo
    public MiVentanita(){
        super("Mi segunda ventana");
        this.setBounds(250,100,350,350);//--> llamos a vetana heredadas, este en la misma linea escribes lo mismo
        //es mas util
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //llamos al metodo
        construirPanel();
        //hacerlo visible IMPORTATE DE ULTIMO
        this.setVisible(true);
    }
    //esto lleva tod de Jpanel
    private void construirPanel(){
        panel = new JPanel();

        etq = new JLabel("Nombre");
        //asociamnos todos
        panel.add(etq);

        campo = new JTextField(10);
        panel.add(campo);

        botton = new JButton("Saludar");
        panel.add(botton);

        etqSaludo = new JLabel("");
        panel.add(etqSaludo);
        //asociamos la repuesta al click del raton al botton
        botton.addActionListener(this);
        //asociamos la vetana al panel
        this.setContentPane(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //El cuerpo del meotodo es la repuesta ante el evento de un click este metodo lo llama el sistemas operativo
        //Esto coge el nombre que hay en el campo de texto y lo guarda en un String
        String nombre = campo.getText();
        //Realizamos un set de la etiqueta Nombre
        etqSaludo.setText("Hola "+nombre);
    }
}

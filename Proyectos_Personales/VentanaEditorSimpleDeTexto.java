package Proyectos_Personales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class VentanaEditorSimpleDeTexto extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel et1;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private JTextArea campo;
    private JTextField search;

    public VentanaEditorSimpleDeTexto(){
        super("Editor de Texto");
        this.setBounds(0,0,350,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanales();
        this.setVisible(true);
    }
    //crear un panle
    public void construirPanales(){
        panel = new JPanel();
        //configurar la etiqueta
        et1 = new JLabel();
        et1.setText("Escribe tu texto");
        et1.setFont(new Font("Time Rome",Font.BOLD,18));
        panel.add(et1);
        //configurar texto
        campo = new JTextArea(30,30);
        campo.setBackground(new Color(194,194,194));
        campo.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(campo);

        bt1 = new JButton();
        bt1.setText("Guardar");
        panel.add(bt1);
        bt1.addActionListener(this);

        bt2 = new JButton();
        bt2.setText("Abrir Archivo");
        panel.add(bt2);

        bt3 = new JButton();
        bt3.setText("Cambiar forma de texto");
        panel.add(bt3);

        search = new JTextField();
        panel.add(search);

        bt4 = new JButton();
        bt4.setText("Buscar");
        panel.add(bt4);

        this.setContentPane(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bt1){
            try {
                FileWriter fil = new FileWriter("fichero.txt");
                String texto = campo.getText();
                fil.write(texto);
                fil.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.*;

public class praticandoVentanas extends JFrame {
    JPanel lienzoCont;
    JLabel etq1,etq2,etq3,etq4;
    JTextField campoNom,campoPass;
    JButton btoIniciar,btoNuv;

    public praticandoVentanas(){
        super("Iniciar Sesión");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(240, 248, 255));
        this.setLayout(new FlowLayout());
        constructorContenedor();
        this.setVisible(true);
    }
    public void constructorContenedor(){
        lienzoCont = new JPanel();
        lienzoCont.setBackground(new Color(128,128,128));
        lienzoCont.setBorder(BorderFactory.createTitledBorder("Iniciar Sesión"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lienzoCont.setLayout(new GridBagLayout());


        gbc.gridx = 0;
        gbc.gridy = 0;
        etq2 = new JLabel("Nombre: ");
        etq2.setFont(new Font("Serif",Font.BOLD,20));
        campoNom = new JTextField(10);
        campoNom.setFont(new Font("Arial",Font.PLAIN,15));
        lienzoCont.add(etq2,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        lienzoCont.add(campoNom,gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        etq3 = new JLabel("Contraseña: ");
        etq3.setFont(new Font("Serif",Font.BOLD,20));
        campoPass = new JTextField(10);
        campoPass.setFont(new Font("Arial",Font.PLAIN,14));
        lienzoCont.add(etq3,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        lienzoCont.add(campoPass,gbc);

        btoIniciar =  new JButton("Iniciar Sesión");
        btoIniciar.setFont(new Font("Arial",Font.BOLD,14));
        btoIniciar.setBackground(new Color(45, 118, 240));
        btoIniciar.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        lienzoCont.add(btoIniciar,gbc);

        btoNuv = new JButton("Nuevo Usuario");
        btoNuv.setFont(new Font("Arial",Font.BOLD,14));
        btoNuv.setBackground(new Color(45, 118, 240));
        btoNuv.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 2;
        lienzoCont.add(btoNuv,gbc);



        this.add(lienzoCont);
    }
}

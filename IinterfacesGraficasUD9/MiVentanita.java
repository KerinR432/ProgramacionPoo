package IinterfacesGraficasUD9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
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
        panel = new JPanel();
        panel.setBackground(new Color(245, 245, 250));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(30, 50, 50, 50));

        etq = new JLabel("Nombre");
        etq.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        etq.setForeground(new Color(50, 50, 70));
        etq.setAlignmentX(Component.CENTER_ALIGNMENT);


        //asociamnos todos
        panel.add(etq);

        campo = new JTextField(10);
        panel.add(campo);

        botton = new JButton();
        botton.setBackground(new Color(245, 245, 250));
        botton.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        botton = createStyledButton("Saludar");

        panel.add(botton);

        etqSaludo = new JLabel("");
        panel.add(etqSaludo);
        //asociamos la repuesta al click del raton al botton
        botton.addActionListener(this);
        //asociamos la vetana al panel
        panel.add(Box.createRigidArea(new Dimension(0, 25)));

        this.setContentPane(panel);
    }
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setBackground(new Color(30, 136, 229));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setOpaque(true);
        return button;

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

package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaButton extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton boton1, boton2;

    public VentanaButton() {
        super("Ventanas con Bonotos");
        this.setBounds(0, 0, 450, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }

    private void construirPanel() {
        panel = new JPanel();

        boton1 = new JButton("boton 1");
        panel.add(boton1);

        boton2 = new JButton("boton 2");
        panel.add(boton2);

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) { //e.getSource() da la dirección de memoria y la comparamos con el objeto que llama a la acción
            System.out.println(" Ha pulsado el boton 1");
        }else{
            System.out.println("Has pulsado el boton 2");
        }
    }
}

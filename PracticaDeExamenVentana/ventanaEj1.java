/**
 * 1. Escribe el programa “Hola Mundo”. Solamente tendrá un botón y una etiqueta. La etiqueta
 * tendrá inicialmente un texto vacío y se cambiará a “Hola Mundo” al pulsar el botón.
 */
package PracticaDeExamenVentana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaEj1 extends JFrame implements ActionListener {
    JPanel panel;
    JButton bto;
    JLabel et1;

    public ventanaEj1() {
        super("Hola Mundo");
        this.setBounds(0, 0, 450, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }

    public void construirPanel() {
        panel = new JPanel();

        et1 = new JLabel();
        panel.add(et1);

        bto = new JButton("Tocame");
        panel.add(bto);
        bto.addActionListener(this);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bto) {
            et1.setText("Hola Mundo!!!");
        }
    }
}

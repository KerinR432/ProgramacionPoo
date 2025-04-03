package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaCambioVen extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel et1;
    private JButton bto1;
    private VentanitaCambioVen2 vc2;
    public VentanitaCambioVen() {
        super("Cambiar de ventanas");
        this.setBounds(0, 0, 450, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);


    }

    public void setVentanaSecundaria(VentanitaCambioVen2 v2){
        vc2 = v2;
    }

    private void construirPanel(){
        panel = new JPanel();

        et1 = new JLabel();
        et1.setText("Cambia de pestaña");
        panel.add(et1);

        bto1 = new JButton("Pulsa");
        panel.add(bto1);
        bto1.addActionListener(this);

        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        vc2.setVisible(true);
    }
}

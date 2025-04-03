package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaCambioVen2 extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel et1;
    private JButton bto1;
    private VentanitaCambioVen v1;
    public VentanitaCambioVen2() {
        super("Soy la vetana 2");
        this.setBounds(100, 0, 450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();


    }
    public void setVetanaPrincipal(VentanitaCambioVen v1){
        this.v1 = v1;
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

    public void actionPerformed(ActionEvent e) {
       this.setVisible(false);
       v1.setVisible(true);
    }
}

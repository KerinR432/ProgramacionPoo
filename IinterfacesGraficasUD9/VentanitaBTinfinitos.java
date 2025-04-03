package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanitaBTprogramatica extends JFrame implements ActionListener {

    private final JButton[] bto;

    public VentanitaBTprogramatica(){
        super();
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        bto = new JButton[25];
        this.setVisible(true);

    }

    private void construirPanel(){
        JPanel panel = new JPanel();

        int conts = 25;
        for (int i = 0; i < conts; i++) {
            bto[i] = new JButton((i+1)+"");
            panel.add(bto[i]);
            bto[i].addActionListener(this);
        }
        this.add(panel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
       JButton boton = (JButton)e.getSource();
        System.out.println("Has pulsado el boton: "+boton.getText());
    }
}


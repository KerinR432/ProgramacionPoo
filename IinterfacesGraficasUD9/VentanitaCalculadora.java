package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaCalculadora extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel etq1,etq2,etq3,etq4;
    private JTextField TBoperador1,TBoperador2,TBresultado;
    private JButton BTsuma,BTresta,BTmultiplicación,BTdivision,BTlimpiar;

    public VentanitaCalculadora (){
        super("¡Gran Calculadora!");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }

    private void construirPanel(){
        panel = new JPanel();

        etq1 = new JLabel();
        etq1.setText("Primer Numero: ");
        panel.add(etq1);

        TBoperador1 = new JTextField(3);
        panel.add(TBoperador1);

        etq2 = new JLabel();
        etq2.setText(" ");
        panel.add(etq2);

        etq3 = new JLabel();
        etq3.setText("Segundo Numero");
        panel.add(etq3);

        TBoperador2 = new JTextField(3);
        panel.add(TBoperador2);

        etq4 = new JLabel();
        etq4.setText("=");
        panel.add(etq4);

        TBresultado = new JTextField(3);
        panel.add(TBresultado);


        BTsuma = new JButton("Sumar");
        panel.add(BTsuma);
        BTsuma.addActionListener(this);

        BTresta = new JButton("Resta");
        panel.add(BTresta);
        BTresta.addActionListener(this);

        BTmultiplicación = new JButton("Multiplicación");
        panel.add(BTmultiplicación);
        BTmultiplicación.addActionListener(this);

        BTdivision = new JButton("División");
        panel.add(BTdivision);
        BTdivision.addActionListener(this);

        BTlimpiar = new JButton("Limpia");
        panel.add(BTlimpiar);
        BTlimpiar.addActionListener(this);

        this.add(panel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String abc = "ABCDEFGHIJKLMNOPQRSTVWZX";
        if (TBoperador1.getText() == abc) {
            etq1.setText("Error, no puedes introducir letras");
            return;
        } else {
            if (e.getSource() == BTsuma) {
                int num = Integer.parseInt(TBoperador1.getText()) + Integer.parseInt(TBoperador2.getText());
                etq2.setText("+");
                TBresultado.setText(num + "");

            }
            if (e.getSource() == BTresta) {
                int num = Integer.parseInt(TBoperador1.getText()) - Integer.parseInt(TBoperador2.getText());
                etq2.setText("-");
                TBresultado.setText(num + "");

            }

            if (e.getSource() == BTmultiplicación) {
                double num = Double.parseDouble(TBoperador1.getText()) * Double.parseDouble(TBoperador2.getText());
                etq2.setText("*");
                TBresultado.setText(num + "");

            }

            if (e.getSource() == BTdivision) {
                double num = Double.parseDouble(TBoperador1.getText()) / Double.parseDouble(TBoperador2.getText());
                etq2.setText("/");
                TBresultado.setText(num + "");

            }

            if (e.getSource() == BTlimpiar) {
                etq2.setText("");
                TBresultado.setText("");
                TBoperador1.setText("");
                TBoperador2.setText("");
            }


        }
    }
}

package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VentanitaAdivinar extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel etq1, etq2;
    private JButton jugar, mayor, menor, acertar;
    private JTextField numero;
    private   Boolean ganar;

    public VentanitaAdivinar() {
        super("Adivina!!!");
        this.setBounds(0, 0, 500, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }

    private void construirPanel() {
        panel = new JPanel();

        etq1 = new JLabel("Introduce un numero");
        panel.add(etq1);
        numero = new JTextField(5);
        panel.add(numero);


        etq2 = new JLabel();
        panel.add(etq2);

        jugar = new JButton("Empezar partida");
        panel.add(jugar);
        jugar.addActionListener(this);
        mayor = new JButton("El numero es mayor");
        mayor.addActionListener(this);

        panel.add(mayor);


        menor = new JButton("El numero es menor");
        menor.addActionListener(this);
        panel.add(menor);


        acertar = new JButton("Has acertado");
        panel.add(acertar);
        acertar.addActionListener(this);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int max=100;
        ganar = false;
        if (e.getSource()==acertar) {
            etq2.setText("Has acertado");
            ganar = true;
        }

        Random random = new Random();
        int num = random.nextInt(100);
        if(e.getSource()==menor){
            num = random.nextInt(100);
            etq2.setText(String.valueOf((max-num+1)/2));
        }
        if (e.getSource()==mayor) {
            max = random.nextInt(100);
            etq2.setText(String.valueOf((num+max+1)/2));

        }

    }

}

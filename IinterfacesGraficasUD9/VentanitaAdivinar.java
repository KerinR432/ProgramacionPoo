package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VentanitaAdivinar extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel etq1;
    private JButton mayor, menor, acertar;
    private JTextField numero;
    private   Boolean ganar;
    private int max, min, numGenerado;

    public VentanitaAdivinar() {
        super("Adivina!!!");
        min = 1;
        max = 100;
        this.setBounds(0, 0, 500, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }

    private void construirPanel() {
        panel = new JPanel();

        etq1 = new JLabel();
        numGenerado=generaNUmero();
        etq1.setText("Creo que el numero es:"+numGenerado);
        panel.add(etq1);
        numero = new JTextField(5);


        mayor = new JButton("Mayor");
        mayor.addActionListener(this);

        panel.add(mayor);


        menor = new JButton("Menor");
        menor.addActionListener(this);
        panel.add(menor);


        acertar = new JButton("Igual");
        panel.add(acertar);
        acertar.addActionListener(this);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ganar = false;
        if (e.getSource()==acertar) {
            etq1.setText("Has acertado");
            menor.setEnabled(false);
            mayor.setEnabled(false);
            acertar.setText("Empezar");
            //ganar = true;
        }


        if(e.getSource()==menor){
            max = numGenerado;
            numGenerado=generaNUmero();
            etq1.setText("Creo que el numero es:"+numGenerado);

        }
        if (e.getSource()==mayor) {
            min = numGenerado;
            numGenerado=generaNUmero();
            etq1.setText("Creo que el numero es:"+numGenerado);

        }

    }
    private int generaNUmero(){
        int num = (max-min)/2 + min;
        System.out.println("Min: "+ min +" Max: "+ max +" num "+ num);
        return num;
    }

}

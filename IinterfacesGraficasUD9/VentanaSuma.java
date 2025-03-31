package IinterfacesGraficasUD9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSuma extends JFrame implements ActionListener {
    private JPanel lienzo;
    private JLabel et1,et2;
    private JTextField campo1,campo2;
    private JButton suma;
    private JLabel et3;

    public VentanaSuma(){
        super("Suma");
        this.setBounds(350,100,250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ContruirVentana();
        this.setVisible(true);

    }

    private void ContruirVentana(){
        lienzo = new JPanel();

        et1 = new JLabel("Operación 1 :");
        lienzo.add(et1);
        campo1 = new JTextField(2);
        lienzo.add(campo1);


        et2 = new JLabel("Operación 2 :");
        lienzo.add(et2);
        campo2 = new JTextField(2);
        lienzo.add(campo2);


        suma = new JButton("Sumar");
        lienzo.add(suma);

        et3 = new JLabel(" ");
        lienzo.add(et3);
        suma.addActionListener(this);

        this.add(lienzo);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String num1 = campo1.getText();
        String num2 = campo2.getText();
        int resultado = Integer.parseInt(num1)+Integer.parseInt(num2);

        et3.setText("La suma de tus numero son: "+resultado);
    }
}

package IinterfacesGraficasUD9;

import javax.swing.*;

public class VentanitaEstadisticas_texto extends JFrame {

    private JPanel panel;
    private JLabel etq1,etq2,etq3,etq4,etq5,etq6;
    private JTextArea textBox;

    public VentanitaEstadisticas_texto(){
        super("Escribe tu cuento");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contruirPanel();
        this.setVisible(true);
    }

    private void contruirPanel(){
        panel = new JPanel();

        etq1 = new JLabel();
        etq1.setText("Escribe tu Historia");
        panel.add(etq1);

        textBox = new JTextArea();
        textBox.setColumns(30);
        textBox.setRows(15);
        panel.add(textBox);

        etq2 = new JLabel();
        etq2.setText("El número de letras");
        panel.add(etq2);

        etq3 = new JLabel();
        etq3.setText("El número de Palabras");
        panel.add(etq3);

        etq4 = new JLabel();
        etq4.setText("El número de espacios");
        panel.add(etq4);

        etq5 = new JLabel();
        etq5.setText("El número de vocales");
        panel.add(etq5);

        etq6 = new JLabel();
        etq6.setText("El número de consonantes");
        panel.add(etq6);

        this.add(panel);
    }

}

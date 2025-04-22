package EjerciciosVentanaFichero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MiVentanitablocNota extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel et1,et2;
    private JButton bto1,bto2,bto3;
    private JTextArea cuadroTxt;

    public MiVentanitablocNota(){
        super("Block de notas");
        this.setBounds(0,0,280,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();

        this.setVisible(true);
    }
    private void construirPanel(){
        panel = new JPanel();
        et1 = new JLabel();
        et1.setText("Introduce tus notas");
        panel.add(et1);

        cuadroTxt = new JTextArea(20,20);
        cuadroTxt.setBackground(new Color(220,220,220));
        cuadroTxt.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        panel.add(cuadroTxt);

        bto1 = new JButton("Limpiar");
        panel.add(bto1);
        bto1.addActionListener(this);
        bto2 = new JButton("Enviar");
        panel.add(bto2);
        bto2.addActionListener(this);

        bto3 = new JButton("Leer");
        panel.add(bto3);
        bto3.addActionListener(this);

        this.setContentPane(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bto1){
            cuadroTxt.setText("");

        }
        if (e.getSource() == bto2){
            try {
                FileWriter fil = new FileWriter("bloc.txt");
                String texto = cuadroTxt.getText();
                fil.write(texto);
                fil.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (e.getSource()==bto3){
            try {
                FileReader leer = new FileReader("bloc.txt");
                String texto = "";
                int car = 0;
                while ((car=leer.read())!=-1){
                    texto+=(char)car;
                    cuadroTxt.setText(texto);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}

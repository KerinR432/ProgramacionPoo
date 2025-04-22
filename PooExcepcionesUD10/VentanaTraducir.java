package PooExcepcionesUD10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VentanaTraducir extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel et1,et2;
    private JTextField text1,text2;
    private JButton bt1,bt2;

    public VentanaTraducir (){
        super("Traductor");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        construirPanel();
        this.setVisible(true);
    }
    public void construirPanel(){
        JPanel panel = new JPanel();

        et1 = new JLabel();
        et1.setText("Introduce una palabra");
        panel.add(et1);

        text1 = new JTextField(5);
        panel.add(text1);

        et2 = new JLabel();
        et2.setText("la traduccón");
        panel.add(et2);

        text2 = new JTextField(5);
        panel.add(text2);

        bt1 = new JButton();
        bt1.setText("Español");
        bt1.addActionListener(this);
        panel.add(bt1);

        bt2 = new JButton();
        bt2.setText("Ingles");
        bt2.addActionListener(this);
        panel.add(bt2);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileReader leer;
        ArrayList<String> traduccion = new ArrayList<>();
        String texto = "";
        String separar=",";
            try {
                leer = new FileReader("palabras.txt");
                int car = 0;
                while(car!=-1){
                    car = leer.read();
                    for (int i = 0; i < traduccion.size(); i++) {
                    traduccion.add(car+"");
                    }
                     texto = String.valueOf(traduccion);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        if (e.getSource() == bt2){
            for(String i : traduccion){
                texto = String.valueOf(traduccion);


            }
        }
    }
}

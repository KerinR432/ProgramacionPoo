package PooExcepcionesUD10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
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
        this.getContentPane().setBackground(new Color(255, 182, 193));
        this.setVisible(true);
    }
    public void construirPanel(){
        panel = new JPanel();
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
        bt1.setText("Español ￫ Inglés");
        bt1.setBackground(new Color(173, 216, 230));
        bt1.addActionListener(this);
        panel.add(bt1);

        bt2 = new JButton();
        bt2.setText("Ingles ￫ Español");
        bt2.setBackground(new Color(173, 216, 230));
        bt2.addActionListener(this);
        panel.add(bt2);

        this.add(panel);
    }

    private ArrayList<String> diccionario() {
        FileReader entrada;
        String texto ="";
        ArrayList<String>Traducciones = new ArrayList<String>();
        try {
            int car=0;
            entrada = new FileReader("palabras.txt");
            while (car!=-1){
                car= entrada.read();
                if (car!=-1 && car!=10){
                    texto+=(char)car;
                }else{
                    Traducciones.add(texto);
                    texto="";
                }
            }
            entrada.close();
            return Traducciones;
        } catch (FileNotFoundException e) { //<-- este es él más concreto
            System.out.println(e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (String palabras : diccionario()) {
            String[] Traduccion=palabras.split(", ");
            if (e.getSource()==bt1) {
                if(text1.getText().equals(Traduccion[0])){
                    text2.setText(Traduccion[1]);
                    return;
                }
            }
            if (e.getSource()==bt2) {
                if(text2.getText().equals(Traduccion[1])){
                    text1.setText(Traduccion[0]);
                    return;
                }
            }
        }
    }
}

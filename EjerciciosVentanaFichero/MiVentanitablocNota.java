package EjerciciosVentanaFichero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        panel.add(cuadroTxt);

        bto1 = new JButton("Limpiar");
        panel.add(bto1);
        bto1.addActionListener(this);
        bto2 = new JButton("Enviar");
        panel.add(bto2);

        bto3 = new JButton("Leer");
        panel.add(bto3);

        this.setContentPane(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bto1){
            cuadroTxt.setText("");
        }
    }
}

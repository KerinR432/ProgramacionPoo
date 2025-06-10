package practicasExtraOrdinarias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ej7Adivino extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel campoNumero, texto;
	private JButton mayor, menor, igual;
	private int num, numMayor, numMenor;

	public ej7Adivino() {
		super("Adivino");
		num = 50;
		numMayor = 100;
		numMenor = 1;
		this.setBounds(500, 500, 300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		construyePanel();
		this.setVisible(true);
	}

	private void construyePanel() {
		panel = new JPanel();
		campoNumero=new JLabel(" "+num+" ");
		panel.add(campoNumero);
		menor=new JButton("<");
		menor.addActionListener(this);
		panel.add(menor);
		igual=new JButton("=");
		igual.addActionListener(this);
		panel.add(igual);
		mayor=new JButton(">");
		mayor.addActionListener(this);
		panel.add(mayor);
		texto=new JLabel();
		panel.add(texto);
		this.add(panel);
	}
	
	private void generaNumero() {
		num=(numMayor-numMenor)/2+numMenor;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menor) {
			numMayor=num;
			generaNumero();
			campoNumero.setText(" "+num+" ");
		}
		if(e.getSource()==mayor) {
			numMenor=num;
			generaNumero();
			campoNumero.setText(" "+num+" ");
		}
		if(e.getSource()==igual) {
			texto.setText("Al fin he adivinado el número");
		}
	}

}

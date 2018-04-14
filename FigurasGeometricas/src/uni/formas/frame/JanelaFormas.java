package uni.formas.frame;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uni.formas.Forma;

public class JanelaFormas extends JFrame {
	
	private ArrayList<Forma> formas;
	
	public JanelaFormas(int w, int h) {
		formas = new ArrayList<Forma>();
		setSize(w, h);
		setResizable(false);
		setContentPane(new JPanel() {
			@Override
			protected void paintComponent(java.awt.Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				for(Forma f : formas) {
					f.print(g2);
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addForma(Forma f) {
		formas.add(f);
	}
}

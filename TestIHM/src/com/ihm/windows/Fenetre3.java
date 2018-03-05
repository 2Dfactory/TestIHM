package com.ihm.windows;

import javax.swing.JFrame;

import com.ihm.panels.PanneauRondMove;

public class Fenetre3 extends JFrame {

	private PanneauRondMove pane;
	
	public Fenetre3(PanneauRondMove pane) {
		
		this.pane = pane;
		
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(this.pane);
		this.setVisible(true);
		go();
	}
	
	private void go() {
		
		for(int i = -50; i < pane.getWidth(); i++) {
			
			int x = pane.getPosX(), y = pane.getPosY();
			
			x++;
			y++;
			
			pane.setPosX(x);
			pane.setPosY(y);
			pane.repaint();
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
		
	}

}

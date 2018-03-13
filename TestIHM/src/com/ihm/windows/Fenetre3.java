package com.ihm.windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ihm.panels.PanneauRondMove;

public class Fenetre3 extends JFrame {

	private PanneauRondMove panRM = new PanneauRondMove();
	private JButton bouton = new JButton("Mon bouton");
	private JPanel container = new JPanel();
	
	public Fenetre3() {
		
		this.setTitle("Animation");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		container.setBackground(Color.WHITE);
		container.setLayout(new BorderLayout());
		container.add(panRM, BorderLayout.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		
		this.setContentPane(container);
		this.setVisible(true);
		go();
		
	}
	
	private void go() {
		
		for(int i = -50; i < panRM.getWidth(); i++) {
			
			int x = panRM.getPosX(), y = panRM.getPosY();
			
			boolean backX = false, backY = false;
			
			while(true) {
				
				if(x < 1) backX = false;
				if(x > panRM.getWidth() - 50) backX = true;
				
				if(y < 1) backY = false;
				if(y > panRM.getHeight() - 50) backY = true;
				
				if(!backX) panRM.setPosX(++x);
				else panRM.setPosX(--x);
				
				if(!backY) panRM.setPosY(++y);
				else panRM.setPosY(--y);
				
				panRM.repaint();

				try {
					Thread.sleep(5);
				}
				catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}
	
}

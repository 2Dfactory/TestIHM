package com.ihm.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ihm.boutons.Bouton3;
import com.ihm.panels.PanneauRondMove;

public class Fenetre7 extends JFrame implements ActionListener{

	private PanneauRondMove panRM = new PanneauRondMove();
	private Bouton3 bouton = new Bouton3("Mon bouton");
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Le JLabel");
	private int compteur = 0;
	
	public Fenetre7() {
		
		this.setTitle("Animation");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		bouton.addActionListener(this);
		
		container.setBackground(Color.WHITE);
		container.setLayout(new BorderLayout());
		container.add(panRM, BorderLayout.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		
		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		container.add(label, BorderLayout.NORTH);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.compteur++;
		
		label.setText("Vous avez cliqué "+this.compteur+" fois.");
		
	}
	
}

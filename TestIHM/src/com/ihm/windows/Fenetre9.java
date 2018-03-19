package com.ihm.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ihm.boutons.Bouton3;
import com.ihm.panels.PanneauRondMove;

public class Fenetre9 extends JFrame{

	private PanneauRondMove panRM = new PanneauRondMove();
	private JButton bouton = new JButton("Go");
	private JButton bouton2 = new JButton("Stop");
	private JPanel container = new JPanel();
	private JPanel south = new JPanel();
	private JLabel label = new JLabel("Animation lancée");
	private int x, y;
	private boolean backX, backY;
	private boolean animated = true;
	
	public Fenetre9() {
		
		this.setTitle("Animation");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		bouton.addActionListener(new boutonListener());
		bouton2.addActionListener(new bouton2Listener());
		
		south.add(bouton);
		south.add(bouton2);
		
		container.setBackground(Color.WHITE);
		container.setLayout(new BorderLayout());
		container.add(panRM, BorderLayout.CENTER);
		container.add(south, BorderLayout.SOUTH);
		
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
		
		x = panRM.getPosX();
		y = panRM.getPosY();
		
		while(this.animated) {
			
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
				Thread.sleep(3);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
		
	}

	class boutonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText("Animation lancée");
			animated = true;
			bouton.setEnabled(false);
			bouton2.setEnabled(true);
			go();
			
		}
		
	}
	
	class bouton2Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText("Animation arrêtée");
			animated = false;
			bouton.setEnabled(true);
			bouton2.setEnabled(false);		
			
		}
		
	}
	
	
}

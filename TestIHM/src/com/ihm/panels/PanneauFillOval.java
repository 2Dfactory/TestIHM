package com.ihm.panels;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauFillOval extends JPanel {

	public void paintComponent(Graphics g) {
		
		System.out.println("Je suis ex�cut� !");
		
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		
		g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
		
	}
	
}

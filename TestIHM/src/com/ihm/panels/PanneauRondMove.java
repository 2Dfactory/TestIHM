package com.ihm.panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauRondMove extends JPanel{

	//Variable servant à définir les coordonnées du rond rouge
	private int posX = -50;
	private int posY = -50;

	public void paintComponent(Graphics g) {
		
		//Création d'un rectangle de la surface du panel afin "d'effacer" l'affichage précédant
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//Création d'un rond rouge
		g.setColor(Color.RED);
		g.fillOval(posX, posY, 50, 50);
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}

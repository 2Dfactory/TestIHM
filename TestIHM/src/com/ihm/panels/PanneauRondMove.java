package com.ihm.panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauRondMove extends JPanel{

	//Variable servant � d�finir les coordonn�es du rond rouge
	private int posX = -50;
	private int posY = -50;

	public void paintComponent(Graphics g) {
		
		//Cr�ation d'un rectangle de la surface du panel afin "d'effacer" l'affichage pr�c�dant
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//Cr�ation d'un rond rouge
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

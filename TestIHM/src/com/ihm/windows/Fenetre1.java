package com.ihm.windows;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre1 extends JFrame {
	
	public Fenetre1() {
		//Ajout d'un titre à la fenêtre
		this.setTitle("Ma première fenêtre JAVA");
		
		//Définition de ses dimensions (400 pixels de large x 100 pixels de haut
		this.setSize(400, 100);
		
		//Positionnement de la fenêtre au centre de l'écran
		this.setLocationRelativeTo(null);
		
		//Termine le processus quand on click sur la croix rouge
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		
		//Définition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		
		//On indique à notre JFrame que notre JPanel sera son "content pane"
		this.setContentPane(pan);
		
		//Affiche la fenêtre à l'écran
		this.setVisible(true);
	}

}

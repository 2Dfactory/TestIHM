package com.base.ihm;

import javax.swing.JFrame;

public class TestIHM1 {

	public static void main(String[] args) {

		//Instanciation d'une fenêtre
		JFrame fenetre = new JFrame();
		
		//Ajout d'un titre à la fenêtre
		fenetre.setTitle("Ma première fenêtre JAVA");
		
		//Définition de ses dimensions (400 pixels de large x 100 pixels de haut
		fenetre.setSize(400, 100);
		
		//Positionnement de la fenêtre au centre de l'écran
		fenetre.setLocationRelativeTo(null);
		
		//Termine le processus quand on click sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affiche la fenêtre à l'écran
		fenetre.setVisible(true);
		
	}

}

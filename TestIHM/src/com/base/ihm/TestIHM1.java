package com.base.ihm;

import javax.swing.JFrame;

public class TestIHM1 {

	public static void main(String[] args) {

		//Instanciation d'une fen�tre
		JFrame fenetre = new JFrame();
		
		//Ajout d'un titre � la fen�tre
		fenetre.setTitle("Ma premi�re fen�tre JAVA");
		
		//D�finition de ses dimensions (400 pixels de large x 100 pixels de haut
		fenetre.setSize(400, 100);
		
		//Positionnement de la fen�tre au centre de l'�cran
		fenetre.setLocationRelativeTo(null);
		
		//Termine le processus quand on click sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affiche la fen�tre � l'�cran
		fenetre.setVisible(true);
		
	}

}

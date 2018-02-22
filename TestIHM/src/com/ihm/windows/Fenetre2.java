package com.ihm.windows;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre2 extends JFrame {
	
	public Fenetre2(JPanel jp) {
		//Ajout d'un titre à la fenêtre
		this.setTitle("Ma première fenêtre JAVA");
		
		//Définition de ses dimensions (400 pixels de large x 100 pixels de haut
		this.setSize(400, 400);
		
		//Positionnement de la fenêtre au centre de l'écran
		this.setLocationRelativeTo(null);
		
		//Termine le processus quand on click sur la croix rouge
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//On indique à notre JFrame que notre objet Panneau sera son "content pane"
		this.setContentPane(jp);
		
		//Affiche la fenêtre à l'écran
		this.setVisible(true);
	}

}

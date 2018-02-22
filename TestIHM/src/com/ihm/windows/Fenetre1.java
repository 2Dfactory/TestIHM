package com.ihm.windows;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre1 extends JFrame {
	
	public Fenetre1() {
		//Ajout d'un titre � la fen�tre
		this.setTitle("Ma premi�re fen�tre JAVA");
		
		//D�finition de ses dimensions (400 pixels de large x 100 pixels de haut
		this.setSize(400, 100);
		
		//Positionnement de la fen�tre au centre de l'�cran
		this.setLocationRelativeTo(null);
		
		//Termine le processus quand on click sur la croix rouge
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		
		//D�finition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		
		//On indique � notre JFrame que notre JPanel sera son "content pane"
		this.setContentPane(pan);
		
		//Affiche la fen�tre � l'�cran
		this.setVisible(true);
	}

}

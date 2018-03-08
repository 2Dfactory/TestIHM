package com.ihm.windows;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FLayoutBorder extends JFrame {

	public FLayoutBorder() {
		
		//Paramètre de la fenêtre
		this.setTitle("BorderLayout");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Choix du Layout. Ici on utilise le "BorderLayout
		this.setLayout(new BorderLayout());
		
		//Ajout d'un bouton dans chaque zone du BorderLayout
		if (true) this.getContentPane().add(new JButton("Center"), BorderLayout.CENTER);
		if (true) this.getContentPane().add(new JButton("North"), BorderLayout.NORTH);
		if (true) this.getContentPane().add(new JButton("South"), BorderLayout.SOUTH);
		if (true) this.getContentPane().add(new JButton("West"), BorderLayout.WEST);
		if (true) this.getContentPane().add(new JButton("East"), BorderLayout.EAST);
		
		this.setVisible(true);
		
	}
	
}

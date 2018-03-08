package com.ihm.windows;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FGridLayout extends JFrame {

	public FGridLayout() {
		
		//Param�tre de la fen�tre
		this.setTitle("GridLayout");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Choix du Layout. Ici on utilise le "GridLayout"
		GridLayout gl = new GridLayout();
		//D�finition du nombre de colonnes
		gl.setColumns(2);
		//D�finition du nombre de ligne
		gl.setRows(3);
		//Ajout d'un espacement de 5 pixels entre le colonnes
		gl.setHgap(5);
		//Ajout d'un espacement de 5 pixels entre les lignes
		gl.setVgap(5);
				
		this.setLayout(new GridLayout(3, 2));
		
		//Ajout d'un bouton dans chaque case du GridLayout
		if (true) this.getContentPane().add(new JButton("1"));
		if (true) this.getContentPane().add(new JButton("2"));
		if (true) this.getContentPane().add(new JButton("3"));
		if (true) this.getContentPane().add(new JButton("4"));
		if (true) this.getContentPane().add(new JButton("5"));
		
		this.setVisible(true);
		
	}
	
}

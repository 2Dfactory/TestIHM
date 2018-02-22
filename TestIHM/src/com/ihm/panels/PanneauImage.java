package com.ihm.panels;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauImage extends JPanel {
	
	public void PaintComponent(Graphics g) {
		
		try {
			
			File file = new File("ImageJava.jpg");
			
			if(file.exists()) System.out.println("Fichier trouv�");
			else System.out.println("Non trouv�");
			
			Image img = ImageIO.read(file);
			
			if(img == null) System.out.println("Pas de lecteur d'image trouv�");
			
			if(g.drawImage(img, 0, 0, this)) System.out.println("Image dessin�e");
			else System.out.println("Image non dessin�e");
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}

package com.ihm.panels;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauImage extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		try {
			
			File file = new File("ImageJava.jpg");
			
			if(file.exists()) System.out.println("Fichier trouvé");
			else System.out.println("Non trouvé");
			
			Image img = ImageIO.read(file);
			
			if(img == null) System.out.println("Pas de lecteur d'image trouvé");
			
			int x = img.getWidth(this)/2;
			int y = img.getHeight(this)/2;
			
			int xj = this.getWidth();
			int yj = this.getWidth();
			
			System.out.println("x img : " + x);
			System.out.println("y img : " + y);
			
			System.out.println("x JPanel : " + xj);
			System.out.println("y JPanel : " + yj);
			
			
			if(g.drawImage(img, xj / 2 - x, yj / 2 - y, this)) System.out.println("Image dessinée");
			else System.out.println("Image non dessinée");
			
		}
		catch(IOException ioe) {
			System.err.println("Erreur IO");
			ioe.printStackTrace();
		}
		
	}

}

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
			
			if(file.exists()) System.out.println("Fichier trouvé");
			else System.out.println("Non trouvé");
			
			Image img = ImageIO.read(file);
			
			if(img == null) System.out.println("Pas de lecteur d'image trouvé");
			
			if(g.drawImage(img, 0, 0, this)) System.out.println("Image dessinée");
			else System.out.println("Image non dessinée");
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}

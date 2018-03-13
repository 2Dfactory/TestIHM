package com.ihm.boutons;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton3 extends JButton implements MouseListener{

	private String name;
	private Image img;
	
	public Bouton3(String str) {

		super(str);
		this.name = str;
		
		try {
			img = ImageIO.read(new File("./fondBouton.png"));
		}
		catch(IOException ieo) {
			ieo.printStackTrace();
		}
		
		this.addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, Color.BLUE, 0, 20, Color.CYAN, true);
		g2d.setPaint(gp);
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.setColor(Color.BLACK);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 / 4), (this.getHeight() / 2) + 5);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		try {
			img = ImageIO.read(new File("./fondBoutonY.png"));
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		try {
			img = ImageIO.read(new File("./fondBouton.png"));
		}
		catch(IOException ieo) {
			ieo.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		try {
			img = ImageIO.read(new File("./fondBoutonY.png"));
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		try {
			img = ImageIO.read(new File("./fondBoutonO.png"));
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
}

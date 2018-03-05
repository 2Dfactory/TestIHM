package com.ihm.windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FJButton extends JFrame {

	private JPanel pane = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	
	public FJButton() {
		
		this.pane = pane;
		
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		pane.add(bouton);
		
		this.setContentPane(this.pane);
		this.setVisible(true);
		
	}
	
}

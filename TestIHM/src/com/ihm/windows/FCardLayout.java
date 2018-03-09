package com.ihm.windows;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FCardLayout extends JFrame {

	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	
	String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
	int indice = 0;
	
	public FCardLayout() {
		
		this.setTitle("CardLayout");
		this.setSize(300, 120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel card1 = new JPanel();
		card1.setBackground(Color.BLUE);
		
		JPanel card2 = new JPanel();
		card2.setBackground(Color.RED);
		
		JPanel card3 = new JPanel();
		card3.setBackground(Color.GREEN);
		
		JPanel boutonPane = new JPanel();
		
		JButton bouton1 = new JButton("Contenu suivant");
		bouton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				cl.next(content);
				
			}
		});
		
		JButton bouton2 = new JButton("Contenu par indice");
		bouton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(++indice > 2) indice = 0;
				
				cl.show(content, listContent[indice]);
				
			}
		});
		
		boutonPane.add(bouton1);
		boutonPane.add(bouton2);
		
		content.setLayout(cl);
		
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		content.add(card3, listContent[2]);

		this.getContentPane().add(boutonPane, BorderLayout.NORTH);
		this.getContentPane().add(content, BorderLayout.CENTER);
		
		this.setVisible(true);

	}
	
}

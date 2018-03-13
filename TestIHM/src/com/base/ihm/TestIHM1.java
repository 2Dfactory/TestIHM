package com.base.ihm;

import com.ihm.panels.PanneauFillOval;
import com.ihm.panels.PanneauImage;
import com.ihm.panels.PanneauRondMove;
import com.ihm.windows.FLayoutBox;
import com.ihm.windows.FLayoutGridBag;
import com.ihm.windows.Fenetre2;
import com.ihm.windows.Fenetre3;
import com.ihm.windows.FRondMove;
import com.ihm.windows.FCardLayout;
import com.ihm.windows.FGridLayout;
import com.ihm.windows.FJButton;
import com.ihm.windows.FLayoutBorder;

public class TestIHM1 {

	public static void main(String[] args) {

		switch(10) {
		case 1 : Fenetre2 fen1 = new Fenetre2(new PanneauFillOval());
				break;
		case 2 : Fenetre2 fen2 = new Fenetre2(new PanneauImage());
				System.out.println("Cas 2");
				break;
		case 3 : FRondMove fen3 = new FRondMove(new PanneauRondMove());
				System.out.println("Cas 3");
				break;
		case 4 : FJButton fen4 = new FJButton();
				System.out.println("Cas 4");
				break;
		case 5 : FLayoutBox fen5 = new FLayoutBox();
				System.out.println("Utilisation du BoxLayout");
				break;
		case 6 : FLayoutBorder fen6 = new FLayoutBorder();
				System.out.println("Utilisation du BorderLayout");
				break;		
		case 7 : FGridLayout fen7 = new FGridLayout();
				System.out.println("Utilisation du GridLayout");
				break;				
		case 8 : FCardLayout fen8 = new FCardLayout();
				System.out.println("Utilisation du CardLayout");
				break;			
		case 9 : FLayoutGridBag fen9 = new FLayoutGridBag();
				System.out.println("Utilisation du GridBagLayout");
				break;	
		case 10 : Fenetre3 fen10 = new Fenetre3();
				System.out.println("Fenêtre move rond");
				break;
				
		default : System.out.println("Cas default du switch");
		}

		
	}

}
